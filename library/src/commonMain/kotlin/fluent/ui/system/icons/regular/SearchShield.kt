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

package fluent.ui.system.icons.regular

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
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: search, shield
 * - Source: ic_fluent_search_shield_20_regular.svg
 * 
 * @return The [ImageVector] for the SearchShield icon.
 */
public val FluentIcons.Regular.SearchShield: ImageVector
    get() {
        if (_searchShield != null) {
            return _searchShield!!
        }
        _searchShield = Builder(name = "SearchShield", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.729f, 13.436f)
                curveTo(11.666f, 14.348f, 10.304f, 14.922f, 8.811f, 14.993f)
                curveTo(8.896f, 14.677f, 8.955f, 14.34f, 8.983f, 13.979f)
                curveTo(10.133f, 13.879f, 11.182f, 13.425f, 12.02f, 12.727f)
                curveTo(12.276f, 12.513f, 12.513f, 12.276f, 12.726f, 12.02f)
                curveTo(13.522f, 11.066f, 14.0f, 9.839f, 14.0f, 8.5f)
                curveTo(14.0f, 5.462f, 11.538f, 3.0f, 8.5f, 3.0f)
                curveTo(5.462f, 3.0f, 3.0f, 5.462f, 3.0f, 8.5f)
                curveTo(3.0f, 8.613f, 3.003f, 8.726f, 3.01f, 8.837f)
                curveTo(2.741f, 9.071f, 2.422f, 9.302f, 2.072f, 9.473f)
                curveTo(2.025f, 9.155f, 2.0f, 8.831f, 2.0f, 8.5f)
                curveTo(2.0f, 4.91f, 4.91f, 2.0f, 8.5f, 2.0f)
                curveTo(12.09f, 2.0f, 15.0f, 4.91f, 15.0f, 8.5f)
                curveTo(15.0f, 10.115f, 14.411f, 11.592f, 13.436f, 12.729f)
                lineTo(16.854f, 16.146f)
                curveTo(17.049f, 16.342f, 17.049f, 16.658f, 16.854f, 16.854f)
                curveTo(16.68f, 17.027f, 16.41f, 17.046f, 16.216f, 16.911f)
                lineTo(16.146f, 16.854f)
                lineTo(12.729f, 13.436f)
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
        Image(imageVector = FluentIcons.Regular.SearchShield, contentDescription = null)
    }
}

