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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ArrowCircleDownDouble: ImageVector
    get() {
        if (_ArrowCircleDownDouble != null) {
            return _ArrowCircleDownDouble!!
        }
        _ArrowCircleDownDouble = ImageVector.Builder(
            name = "Regular.ArrowCircleDownDouble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.25f, 13.75f)
                lineTo(11.165f, 13.677f)
                curveTo(10.872f, 13.459f, 10.455f, 13.484f, 10.189f, 13.75f)
                lineTo(9.5f, 14.439f)
                lineTo(9.499f, 7.75f)
                lineTo(9.492f, 7.648f)
                curveTo(9.443f, 7.282f, 9.129f, 7f, 8.749f, 7f)
                lineTo(8.647f, 7.006f)
                curveTo(8.281f, 7.056f, 7.999f, 7.37f, 7.999f, 7.75f)
                lineTo(8f, 14.441f)
                lineTo(7.31f, 13.75f)
                lineTo(7.225f, 13.677f)
                curveTo(6.932f, 13.46f, 6.515f, 13.484f, 6.249f, 13.75f)
                curveTo(5.956f, 14.043f, 5.956f, 14.518f, 6.249f, 14.811f)
                lineTo(8.218f, 16.781f)
                lineTo(8.302f, 16.854f)
                curveTo(8.596f, 17.072f, 9.012f, 17.048f, 9.279f, 16.781f)
                lineTo(11.25f, 14.811f)
                lineTo(11.322f, 14.726f)
                curveTo(11.54f, 14.433f, 11.516f, 14.016f, 11.25f, 13.75f)
                close()
                moveTo(1.999f, 12f)
                curveTo(1.999f, 17.523f, 6.476f, 22f, 11.999f, 22f)
                curveTo(17.522f, 22f, 21.999f, 17.523f, 21.999f, 12f)
                curveTo(21.999f, 6.477f, 17.522f, 2f, 11.999f, 2f)
                curveTo(6.476f, 2f, 1.999f, 6.477f, 1.999f, 12f)
                close()
                moveTo(20.499f, 12f)
                curveTo(20.499f, 16.694f, 16.693f, 20.5f, 11.999f, 20.5f)
                curveTo(7.305f, 20.5f, 3.499f, 16.694f, 3.499f, 12f)
                curveTo(3.499f, 7.306f, 7.305f, 3.5f, 11.999f, 3.5f)
                curveTo(16.693f, 3.5f, 20.499f, 7.306f, 20.499f, 12f)
                close()
                moveTo(17.75f, 13.75f)
                lineTo(17.665f, 13.677f)
                curveTo(17.372f, 13.459f, 16.955f, 13.484f, 16.689f, 13.75f)
                lineTo(16f, 14.439f)
                lineTo(15.999f, 7.749f)
                lineTo(15.992f, 7.648f)
                curveTo(15.943f, 7.282f, 15.629f, 6.999f, 15.249f, 6.999f)
                lineTo(15.147f, 7.006f)
                curveTo(14.781f, 7.056f, 14.499f, 7.37f, 14.499f, 7.749f)
                lineTo(14.5f, 14.441f)
                lineTo(13.81f, 13.75f)
                lineTo(13.726f, 13.677f)
                curveTo(13.432f, 13.46f, 13.015f, 13.484f, 12.749f, 13.75f)
                curveTo(12.456f, 14.043f, 12.456f, 14.518f, 12.749f, 14.811f)
                lineTo(14.718f, 16.781f)
                lineTo(14.802f, 16.854f)
                curveTo(15.096f, 17.072f, 15.512f, 17.048f, 15.779f, 16.781f)
                lineTo(17.75f, 14.811f)
                lineTo(17.822f, 14.726f)
                curveTo(18.04f, 14.433f, 18.016f, 14.016f, 17.75f, 13.75f)
                close()
            }
        }.build()

        return _ArrowCircleDownDouble!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCircleDownDouble: ImageVector? = null

@Preview
@Composable
private fun ArrowCircleDownDoublePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowCircleDownDouble, contentDescription = null)
    }
}
