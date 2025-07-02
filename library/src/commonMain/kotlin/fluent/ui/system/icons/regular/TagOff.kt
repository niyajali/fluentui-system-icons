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
 * TagOff icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: tag, off
 * - Source: ic_fluent_tag_off_24_regular.svg
 * 
 * @return The [ImageVector] for the TagOff icon.
 */
public val FluentIcons.Regular.TagOff: ImageVector
    get() {
        if (_tagOff != null) {
            return _tagOff!!
        }
        _tagOff = Builder(name = "TagOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.942f, 8.003f)
                lineTo(2.22f, 3.28f)
                curveTo(1.927f, 2.987f, 1.927f, 2.513f, 2.22f, 2.22f)
                curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
                lineTo(21.78f, 20.72f)
                curveTo(22.073f, 21.013f, 22.073f, 21.487f, 21.78f, 21.78f)
                curveTo(21.487f, 22.073f, 21.013f, 22.073f, 20.72f, 21.78f)
                lineTo(16.0f, 17.06f)
                lineTo(12.548f, 20.513f)
                curveTo(11.279f, 21.78f, 9.223f, 21.781f, 7.952f, 20.514f)
                lineTo(3.49f, 16.059f)
                curveTo(2.22f, 14.791f, 2.218f, 12.733f, 3.486f, 11.463f)
                lineTo(6.942f, 8.003f)
                close()
                moveTo(14.939f, 16.0f)
                lineTo(8.003f, 9.064f)
                lineTo(4.535f, 12.536f)
                curveTo(3.865f, 13.221f, 3.87f, 14.319f, 4.55f, 14.998f)
                lineTo(9.011f, 19.452f)
                curveTo(9.696f, 20.135f, 10.804f, 20.134f, 11.488f, 19.452f)
                lineTo(14.939f, 16.0f)
                close()
                moveTo(19.988f, 10.949f)
                lineTo(17.0f, 13.939f)
                lineTo(18.06f, 15.0f)
                lineTo(21.049f, 12.01f)
                curveTo(21.659f, 11.4f, 22.001f, 10.574f, 22.001f, 9.712f)
                verticalLineTo(4.25f)
                curveTo(22.001f, 3.007f, 20.993f, 2.0f, 19.751f, 2.0f)
                horizontalLineTo(14.285f)
                curveTo(13.423f, 2.0f, 12.596f, 2.343f, 11.986f, 2.953f)
                lineTo(9.002f, 5.941f)
                lineTo(10.062f, 7.002f)
                lineTo(13.047f, 4.013f)
                curveTo(13.375f, 3.685f, 13.821f, 3.5f, 14.285f, 3.5f)
                horizontalLineTo(19.751f)
                curveTo(20.165f, 3.5f, 20.501f, 3.836f, 20.501f, 4.25f)
                verticalLineTo(9.712f)
                curveTo(20.501f, 10.176f, 20.316f, 10.621f, 19.988f, 10.949f)
                close()
                moveTo(17.001f, 5.502f)
                curveTo(17.829f, 5.502f, 18.501f, 6.174f, 18.501f, 7.002f)
                curveTo(18.501f, 7.831f, 17.829f, 8.502f, 17.001f, 8.502f)
                curveTo(16.172f, 8.502f, 15.501f, 7.831f, 15.501f, 7.002f)
                curveTo(15.501f, 6.174f, 16.172f, 5.502f, 17.001f, 5.502f)
                close()
            }
        }
        .build()
        return _tagOff!!
    }

@Suppress("ObjectPropertyName")
private var _tagOff: ImageVector? = null

@Preview
@Composable
private fun TagOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TagOff, contentDescription = null)
    }
}

