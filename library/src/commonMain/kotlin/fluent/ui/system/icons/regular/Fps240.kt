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

public val FluentIcons.Regular.Fps240: ImageVector
    get() {
        if (_Fps240 != null) {
            return _Fps240!!
        }
        _Fps240 = ImageVector.Builder(
            name = "Regular.Fps240",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.627f, 5.99f)
                curveTo(3.031f, 6.057f, 3.413f, 5.788f, 3.487f, 5.386f)
                lineTo(3.49f, 5.376f)
                curveTo(3.495f, 5.359f, 3.504f, 5.328f, 3.519f, 5.287f)
                curveTo(3.551f, 5.205f, 3.607f, 5.093f, 3.701f, 4.98f)
                curveTo(3.867f, 4.781f, 4.216f, 4.5f, 5f, 4.5f)
                curveTo(5.828f, 4.5f, 6.5f, 5.172f, 6.5f, 6f)
                curveTo(6.5f, 6.618f, 6.299f, 7.018f, 5.994f, 7.351f)
                curveTo(5.66f, 7.715f, 5.205f, 8f, 4.63f, 8.361f)
                lineTo(4.601f, 8.379f)
                curveTo(4.051f, 8.725f, 3.389f, 9.143f, 2.881f, 9.741f)
                curveTo(2.347f, 10.372f, 2f, 11.175f, 2f, 12.25f)
                curveTo(2f, 12.664f, 2.336f, 13f, 2.75f, 13f)
                horizontalLineTo(7.25f)
                curveTo(7.664f, 13f, 8f, 12.664f, 8f, 12.25f)
                curveTo(8f, 11.836f, 7.664f, 11.5f, 7.25f, 11.5f)
                horizontalLineTo(3.597f)
                curveTo(3.689f, 11.181f, 3.841f, 10.929f, 4.025f, 10.712f)
                curveTo(4.361f, 10.316f, 4.824f, 10.01f, 5.399f, 9.65f)
                lineTo(5.495f, 9.59f)
                curveTo(6.012f, 9.266f, 6.625f, 8.882f, 7.1f, 8.364f)
                curveTo(7.639f, 7.776f, 8f, 7.022f, 8f, 6f)
                curveTo(8f, 4.343f, 6.657f, 3f, 5f, 3f)
                curveTo(3.784f, 3f, 3.008f, 3.469f, 2.549f, 4.02f)
                curveTo(2.33f, 4.282f, 2.199f, 4.545f, 2.121f, 4.744f)
                curveTo(2.082f, 4.844f, 2.056f, 4.93f, 2.039f, 4.996f)
                curveTo(2.031f, 5.028f, 2.024f, 5.056f, 2.019f, 5.078f)
                curveTo(2.017f, 5.089f, 2.015f, 5.099f, 2.014f, 5.107f)
                lineTo(2.012f, 5.118f)
                lineTo(2.011f, 5.123f)
                lineTo(2.011f, 5.125f)
                lineTo(2.01f, 5.126f)
                curveTo(1.942f, 5.534f, 2.218f, 5.922f, 2.627f, 5.99f)
                close()
                moveTo(16f, 5.996f)
                curveTo(16f, 4.342f, 17.341f, 3.002f, 18.994f, 3.002f)
                horizontalLineTo(19.006f)
                curveTo(20.659f, 3.002f, 22f, 4.342f, 22f, 5.996f)
                verticalLineTo(10.006f)
                curveTo(22f, 11.659f, 20.659f, 13f, 19.006f, 13f)
                horizontalLineTo(18.994f)
                curveTo(17.341f, 13f, 16f, 11.659f, 16f, 10.006f)
                verticalLineTo(5.996f)
                close()
                moveTo(18.994f, 4.502f)
                curveTo(18.169f, 4.502f, 17.5f, 5.171f, 17.5f, 5.996f)
                verticalLineTo(10.006f)
                curveTo(17.5f, 10.831f, 18.169f, 11.5f, 18.994f, 11.5f)
                horizontalLineTo(19.006f)
                curveTo(19.831f, 11.5f, 20.5f, 10.831f, 20.5f, 10.006f)
                verticalLineTo(5.996f)
                curveTo(20.5f, 5.171f, 19.831f, 4.502f, 19.006f, 4.502f)
                horizontalLineTo(18.994f)
                close()
                moveTo(4.75f, 15f)
                curveTo(4.336f, 15f, 4f, 15.336f, 4f, 15.75f)
                verticalLineTo(21.231f)
                curveTo(4f, 21.645f, 4.336f, 21.981f, 4.75f, 21.981f)
                curveTo(5.164f, 21.981f, 5.5f, 21.645f, 5.5f, 21.231f)
                verticalLineTo(19.503f)
                horizontalLineTo(7.25f)
                curveTo(7.664f, 19.503f, 8f, 19.167f, 8f, 18.753f)
                curveTo(8f, 18.339f, 7.664f, 18.003f, 7.25f, 18.003f)
                horizontalLineTo(5.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(7.75f)
                curveTo(8.164f, 16.5f, 8.5f, 16.164f, 8.5f, 15.75f)
                curveTo(8.5f, 15.336f, 8.164f, 15f, 7.75f, 15f)
                horizontalLineTo(4.75f)
                close()
                moveTo(9.5f, 15.75f)
                curveTo(9.5f, 15.336f, 9.836f, 15f, 10.25f, 15f)
                horizontalLineTo(11.75f)
                curveTo(12.993f, 15f, 14f, 16.007f, 14f, 17.25f)
                curveTo(14f, 18.493f, 12.993f, 19.5f, 11.75f, 19.5f)
                horizontalLineTo(11f)
                verticalLineTo(21.25f)
                curveTo(11f, 21.664f, 10.664f, 22f, 10.25f, 22f)
                curveTo(9.836f, 22f, 9.5f, 21.664f, 9.5f, 21.25f)
                verticalLineTo(15.75f)
                close()
                moveTo(11f, 18f)
                horizontalLineTo(11.75f)
                curveTo(12.164f, 18f, 12.5f, 17.664f, 12.5f, 17.25f)
                curveTo(12.5f, 16.836f, 12.164f, 16.5f, 11.75f, 16.5f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                close()
                moveTo(17.375f, 15f)
                curveTo(16.201f, 15f, 15.25f, 15.951f, 15.25f, 17.125f)
                curveTo(15.25f, 18.299f, 16.201f, 19.25f, 17.375f, 19.25f)
                horizontalLineTo(17.875f)
                curveTo(18.22f, 19.25f, 18.5f, 19.53f, 18.5f, 19.875f)
                curveTo(18.5f, 20.22f, 18.22f, 20.5f, 17.875f, 20.5f)
                horizontalLineTo(17.25f)
                curveTo(16.974f, 20.5f, 16.75f, 20.276f, 16.75f, 20f)
                curveTo(16.75f, 19.586f, 16.414f, 19.25f, 16f, 19.25f)
                curveTo(15.586f, 19.25f, 15.25f, 19.586f, 15.25f, 20f)
                curveTo(15.25f, 21.105f, 16.145f, 22f, 17.25f, 22f)
                horizontalLineTo(17.875f)
                curveTo(19.049f, 22f, 20f, 21.049f, 20f, 19.875f)
                curveTo(20f, 18.701f, 19.049f, 17.75f, 17.875f, 17.75f)
                horizontalLineTo(17.375f)
                curveTo(17.03f, 17.75f, 16.75f, 17.47f, 16.75f, 17.125f)
                curveTo(16.75f, 16.78f, 17.03f, 16.5f, 17.375f, 16.5f)
                horizontalLineTo(18f)
                curveTo(18.276f, 16.5f, 18.5f, 16.724f, 18.5f, 17f)
                curveTo(18.5f, 17.414f, 18.836f, 17.75f, 19.25f, 17.75f)
                curveTo(19.664f, 17.75f, 20f, 17.414f, 20f, 17f)
                curveTo(20f, 15.895f, 19.105f, 15f, 18f, 15f)
                horizontalLineTo(17.375f)
                close()
                moveTo(14.246f, 3f)
                curveTo(14.66f, 3f, 14.996f, 3.336f, 14.996f, 3.75f)
                verticalLineTo(8.251f)
                lineTo(14.996f, 8.256f)
                verticalLineTo(12.25f)
                curveTo(14.996f, 12.664f, 14.66f, 13f, 14.246f, 13f)
                curveTo(13.831f, 13f, 13.496f, 12.664f, 13.496f, 12.25f)
                verticalLineTo(9.001f)
                horizontalLineTo(9.749f)
                curveTo(9.335f, 9.001f, 8.999f, 8.665f, 8.999f, 8.251f)
                verticalLineTo(3.751f)
                curveTo(8.999f, 3.337f, 9.335f, 3.001f, 9.749f, 3.001f)
                curveTo(10.163f, 3.001f, 10.499f, 3.337f, 10.499f, 3.751f)
                verticalLineTo(7.501f)
                horizontalLineTo(13.496f)
                verticalLineTo(7.368f)
                lineTo(13.496f, 7.363f)
                verticalLineTo(3.75f)
                curveTo(13.496f, 3.336f, 13.831f, 3f, 14.246f, 3f)
                close()
            }
        }.build()

        return _Fps240!!
    }

@Suppress("ObjectPropertyName")
private var _Fps240: ImageVector? = null

@Preview
@Composable
private fun Fps240Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Fps240, contentDescription = null)
    }
}
