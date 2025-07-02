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
 * FlagCheckered icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: flag, checkered
 * - Source: ic_fluent_flag_checkered_20_filled.svg
 * 
 * @return The [ImageVector] for the FlagCheckered icon.
 */
public val FluentIcons.Filled.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) {
            return _flagCheckered!!
        }
        _flagCheckered = Builder(name = "FlagCheckered", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 3.25f)
                curveTo(4.5f, 2.836f, 4.836f, 2.5f, 5.25f, 2.5f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 2.5f, 16.5f, 2.836f, 16.5f, 3.25f)
                verticalLineTo(13.75f)
                curveTo(16.5f, 14.164f, 16.164f, 14.5f, 15.75f, 14.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.25f)
                curveTo(6.0f, 17.664f, 5.664f, 18.0f, 5.25f, 18.0f)
                curveTo(4.836f, 18.0f, 4.5f, 17.664f, 4.5f, 17.25f)
                verticalLineTo(3.25f)
                close()
                moveTo(6.0f, 13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

@Suppress("ObjectPropertyName")
private var _flagCheckered: ImageVector? = null

@Preview
@Composable
private fun FlagCheckeredPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FlagCheckered, contentDescription = null)
    }
}

