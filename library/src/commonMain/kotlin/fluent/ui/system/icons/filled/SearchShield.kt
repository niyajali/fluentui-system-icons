/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * SearchShield icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: search, shield
 * - Source: ic_fluent_search_shield_20_filled.svg
 * 
 * @return The [ImageVector] for the SearchShield icon.
 */
public val FluentIcons.Filled.SearchShield: ImageVector
    get() {
        if (_searchShield != null) {
            return _searchShield!!
        }
        _searchShield = Builder(name = "SearchShield", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.535f, 13.596f)
                curveTo(11.502f, 14.415f, 10.215f, 14.927f, 8.811f, 14.993f)
                curveTo(8.931f, 14.546f, 9.0f, 14.054f, 9.0f, 13.517f)
                verticalLineTo(13.475f)
                curveTo(11.527f, 13.224f, 13.5f, 11.093f, 13.5f, 8.5f)
                curveTo(13.5f, 5.739f, 11.261f, 3.5f, 8.5f, 3.5f)
                curveTo(5.783f, 3.5f, 3.572f, 5.668f, 3.502f, 8.368f)
                curveTo(3.465f, 8.4f, 3.43f, 8.433f, 3.395f, 8.469f)
                curveTo(3.074f, 8.806f, 2.608f, 9.211f, 2.072f, 9.473f)
                curveTo(2.025f, 9.155f, 2.0f, 8.831f, 2.0f, 8.5f)
                curveTo(2.0f, 4.91f, 4.91f, 2.0f, 8.5f, 2.0f)
                curveTo(12.09f, 2.0f, 15.0f, 4.91f, 15.0f, 8.5f)
                curveTo(15.0f, 10.025f, 14.475f, 11.427f, 13.596f, 12.535f)
                lineTo(17.03f, 15.97f)
                curveTo(17.323f, 16.263f, 17.323f, 16.737f, 17.03f, 17.03f)
                curveTo(16.764f, 17.297f, 16.347f, 17.321f, 16.054f, 17.103f)
                lineTo(15.97f, 17.03f)
                lineTo(12.535f, 13.596f)
                close()
                moveTo(4.881f, 9.159f)
                curveTo(5.388f, 9.692f, 6.364f, 10.539f, 7.564f, 10.712f)
                curveTo(7.803f, 10.747f, 8.0f, 10.946f, 8.0f, 11.194f)
                verticalLineTo(13.517f)
                curveTo(8.0f, 16.639f, 5.216f, 17.772f, 4.614f, 17.98f)
                curveTo(4.539f, 18.007f, 4.462f, 18.007f, 4.386f, 17.98f)
                curveTo(3.784f, 17.772f, 1.0f, 16.639f, 1.0f, 13.517f)
                lineTo(1.0f, 11.194f)
                curveTo(1.0f, 10.946f, 1.197f, 10.747f, 1.436f, 10.712f)
                curveTo(2.636f, 10.538f, 3.611f, 9.692f, 4.119f, 9.159f)
                curveTo(4.321f, 8.947f, 4.678f, 8.947f, 4.881f, 9.159f)
                close()
            }
        }
        .build()
        return _searchShield!!
    }

@Suppress("ObjectPropertyName")
private var _searchShield: ImageVector? = null

@Preview
@Composable
private fun SearchShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SearchShield, contentDescription = null)
    }
}

