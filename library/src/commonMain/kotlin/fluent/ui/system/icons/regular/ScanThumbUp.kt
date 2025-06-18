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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.ScanThumbUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ScanThumbUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 3.5f)
            curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
            verticalLineTo(8.25f)
            curveTo(3.5f, 8.664f, 3.164f, 9f, 2.75f, 9f)
            curveTo(2.336f, 9f, 2f, 8.664f, 2f, 8.25f)
            verticalLineTo(5.25f)
            curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 2f, 9f, 2.336f, 9f, 2.75f)
            curveTo(9f, 3.164f, 8.664f, 3.5f, 8.25f, 3.5f)
            horizontalLineTo(5.25f)
            close()
            moveTo(5.25f, 20.5f)
            curveTo(4.284f, 20.5f, 3.5f, 19.716f, 3.5f, 18.75f)
            verticalLineTo(15.75f)
            curveTo(3.5f, 15.336f, 3.164f, 15f, 2.75f, 15f)
            curveTo(2.336f, 15f, 2f, 15.336f, 2f, 15.75f)
            verticalLineTo(18.75f)
            curveTo(2f, 20.545f, 3.455f, 22f, 5.25f, 22f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 22f, 9f, 21.664f, 9f, 21.25f)
            curveTo(9f, 20.836f, 8.664f, 20.5f, 8.25f, 20.5f)
            horizontalLineTo(5.25f)
            close()
            moveTo(20.5f, 5.25f)
            curveTo(20.5f, 4.284f, 19.716f, 3.5f, 18.75f, 3.5f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 3.5f, 15f, 3.164f, 15f, 2.75f)
            curveTo(15f, 2.336f, 15.336f, 2f, 15.75f, 2f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 2f, 22f, 3.455f, 22f, 5.25f)
            verticalLineTo(8.25f)
            curveTo(22f, 8.664f, 21.664f, 9f, 21.25f, 9f)
            curveTo(20.836f, 9f, 20.5f, 8.664f, 20.5f, 8.25f)
            verticalLineTo(5.25f)
            close()
            moveTo(18.75f, 20.5f)
            curveTo(19.716f, 20.5f, 20.5f, 19.716f, 20.5f, 18.75f)
            verticalLineTo(15.75f)
            curveTo(20.5f, 15.336f, 20.836f, 15f, 21.25f, 15f)
            curveTo(21.664f, 15f, 22f, 15.336f, 22f, 15.75f)
            verticalLineTo(18.75f)
            curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 22f, 15f, 21.664f, 15f, 21.25f)
            curveTo(15f, 20.836f, 15.336f, 20.5f, 15.75f, 20.5f)
            horizontalLineTo(18.75f)
            close()
            moveTo(11.289f, 6.424f)
            curveTo(11.554f, 5.809f, 12.353f, 5.02f, 13.469f, 5.309f)
            curveTo(14.169f, 5.491f, 14.673f, 5.91f, 14.958f, 6.487f)
            curveTo(15.206f, 6.989f, 15.249f, 7.537f, 15.257f, 7.953f)
            curveTo(15.266f, 8.35f, 15.202f, 8.781f, 15.12f, 9.167f)
            horizontalLineTo(15.314f)
            curveTo(16.872f, 9.167f, 18.136f, 10.6f, 17.646f, 12.158f)
            lineTo(16.497f, 15.812f)
            curveTo(16.031f, 17.295f, 14.397f, 18.062f, 12.919f, 17.629f)
            lineTo(8.407f, 16.306f)
            curveTo(7.706f, 16.1f, 7.123f, 15.598f, 6.85f, 14.919f)
            lineTo(6.412f, 13.83f)
            curveTo(5.973f, 12.74f, 6.452f, 11.544f, 7.467f, 10.985f)
            lineTo(9.009f, 10.136f)
            curveTo(9.017f, 10.13f, 9.027f, 10.123f, 9.039f, 10.113f)
            curveTo(9.09f, 10.073f, 9.182f, 9.994f, 9.302f, 9.868f)
            curveTo(9.541f, 9.616f, 9.898f, 9.168f, 10.264f, 8.439f)
            curveTo(10.442f, 8.087f, 10.591f, 7.81f, 10.723f, 7.565f)
            lineTo(10.724f, 7.563f)
            curveTo(10.936f, 7.168f, 11.101f, 6.863f, 11.289f, 6.424f)
            close()
            moveTo(9.739f, 11.446f)
            lineTo(8.191f, 12.299f)
            curveTo(7.796f, 12.517f, 7.667f, 12.93f, 7.803f, 13.27f)
            lineTo(8.242f, 14.359f)
            curveTo(8.333f, 14.585f, 8.541f, 14.782f, 8.829f, 14.866f)
            lineTo(13.341f, 16.189f)
            curveTo(14.111f, 16.415f, 14.868f, 15.991f, 15.066f, 15.362f)
            lineTo(16.215f, 11.708f)
            curveTo(16.358f, 11.252f, 16.005f, 10.667f, 15.314f, 10.667f)
            horizontalLineTo(14.147f)
            curveTo(13.909f, 10.667f, 13.685f, 10.554f, 13.543f, 10.362f)
            curveTo(13.402f, 10.17f, 13.36f, 9.922f, 13.431f, 9.694f)
            curveTo(13.483f, 9.528f, 13.536f, 9.343f, 13.584f, 9.153f)
            curveTo(13.69f, 8.729f, 13.764f, 8.303f, 13.758f, 7.984f)
            curveTo(13.75f, 7.618f, 13.709f, 7.346f, 13.613f, 7.151f)
            curveTo(13.528f, 6.98f, 13.386f, 6.838f, 13.092f, 6.761f)
            curveTo(12.999f, 6.737f, 12.928f, 6.753f, 12.857f, 6.798f)
            curveTo(12.77f, 6.853f, 12.699f, 6.943f, 12.667f, 7.017f)
            curveTo(12.451f, 7.519f, 12.26f, 7.874f, 12.048f, 8.268f)
            lineTo(12.044f, 8.275f)
            curveTo(11.913f, 8.519f, 11.772f, 8.781f, 11.604f, 9.114f)
            curveTo(11.172f, 9.973f, 10.73f, 10.542f, 10.39f, 10.901f)
            curveTo(10.219f, 11.08f, 10.075f, 11.206f, 9.97f, 11.289f)
            curveTo(9.918f, 11.331f, 9.875f, 11.361f, 9.844f, 11.383f)
            lineTo(9.838f, 11.387f)
            lineTo(9.824f, 11.396f)
            lineTo(9.812f, 11.404f)
            lineTo(9.804f, 11.409f)
            lineTo(9.803f, 11.41f)
            curveTo(9.782f, 11.423f, 9.761f, 11.435f, 9.739f, 11.446f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ScanThumbUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ScanThumbUp, contentDescription = null)
    }
}
