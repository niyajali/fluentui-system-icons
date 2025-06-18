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

public val FluentUi.Regular.ColorFill: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ColorFill",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9f, 1.75f)
            curveTo(9f, 1.336f, 9.336f, 1f, 9.75f, 1f)
            curveTo(10.164f, 1f, 10.5f, 1.336f, 10.5f, 1.75f)
            verticalLineTo(3.015f)
            curveTo(10.951f, 3.056f, 11.39f, 3.248f, 11.735f, 3.593f)
            lineTo(15.271f, 7.129f)
            curveTo(16.052f, 7.91f, 16.052f, 9.176f, 15.271f, 9.957f)
            lineTo(11.028f, 14.2f)
            curveTo(10.247f, 14.981f, 8.981f, 14.981f, 8.2f, 14.2f)
            lineTo(4.664f, 10.664f)
            curveTo(3.883f, 9.883f, 3.883f, 8.617f, 4.664f, 7.836f)
            lineTo(8.907f, 3.593f)
            curveTo(8.937f, 3.563f, 8.968f, 3.534f, 9f, 3.506f)
            verticalLineTo(1.75f)
            close()
            moveTo(9f, 6.25f)
            verticalLineTo(5.621f)
            lineTo(6.111f, 8.511f)
            horizontalLineTo(14.356f)
            curveTo(14.348f, 8.394f, 14.3f, 8.279f, 14.21f, 8.189f)
            lineTo(10.675f, 4.654f)
            curveTo(10.623f, 4.603f, 10.564f, 4.565f, 10.5f, 4.54f)
            verticalLineTo(6.25f)
            curveTo(10.5f, 6.664f, 10.164f, 7f, 9.75f, 7f)
            curveTo(9.336f, 7f, 9f, 6.664f, 9f, 6.25f)
            close()
            moveTo(6.132f, 10.011f)
            lineTo(9.26f, 13.139f)
            curveTo(9.456f, 13.334f, 9.772f, 13.334f, 9.967f, 13.139f)
            lineTo(13.096f, 10.011f)
            horizontalLineTo(6.132f)
            close()
            moveTo(6.586f, 14f)
            horizontalLineTo(4.5f)
            curveTo(3.119f, 14f, 2f, 15.119f, 2f, 16.5f)
            verticalLineTo(19.5f)
            curveTo(2f, 20.881f, 3.119f, 22f, 4.5f, 22f)
            horizontalLineTo(19.5f)
            curveTo(20.881f, 22f, 22f, 20.881f, 22f, 19.5f)
            verticalLineTo(16.5f)
            curveTo(22f, 15.285f, 21.133f, 14.273f, 19.984f, 14.047f)
            curveTo(19.994f, 14.154f, 20f, 14.264f, 20f, 14.375f)
            curveTo(20f, 14.776f, 19.935f, 15.173f, 19.812f, 15.55f)
            curveTo(20.211f, 15.68f, 20.5f, 16.056f, 20.5f, 16.5f)
            verticalLineTo(19.5f)
            curveTo(20.5f, 20.052f, 20.052f, 20.5f, 19.5f, 20.5f)
            horizontalLineTo(4.5f)
            curveTo(3.948f, 20.5f, 3.5f, 20.052f, 3.5f, 19.5f)
            verticalLineTo(16.5f)
            curveTo(3.5f, 15.948f, 3.948f, 15.5f, 4.5f, 15.5f)
            horizontalLineTo(8.335f)
            curveTo(8.03f, 15.356f, 7.744f, 15.159f, 7.493f, 14.907f)
            lineTo(6.586f, 14f)
            close()
            moveTo(14f, 14.375f)
            curveTo(14f, 13.882f, 14.154f, 13.403f, 14.342f, 12.994f)
            curveTo(14.533f, 12.578f, 14.78f, 12.188f, 15.016f, 11.859f)
            curveTo(15.253f, 11.529f, 15.489f, 11.247f, 15.665f, 11.048f)
            curveTo(15.75f, 10.951f, 15.906f, 10.787f, 15.964f, 10.725f)
            lineTo(15.97f, 10.72f)
            curveTo(16.263f, 10.427f, 16.737f, 10.427f, 17.03f, 10.72f)
            lineTo(17.335f, 11.048f)
            curveTo(17.511f, 11.247f, 17.747f, 11.529f, 17.984f, 11.859f)
            curveTo(18.22f, 12.188f, 18.468f, 12.578f, 18.658f, 12.994f)
            curveTo(18.846f, 13.403f, 19f, 13.882f, 19f, 14.375f)
            curveTo(19f, 15.765f, 17.971f, 17f, 16.5f, 17f)
            curveTo(15.029f, 17f, 14f, 15.765f, 14f, 14.375f)
            close()
            moveTo(16.766f, 12.734f)
            curveTo(16.676f, 12.609f, 16.586f, 12.492f, 16.5f, 12.384f)
            curveTo(16.414f, 12.492f, 16.324f, 12.609f, 16.234f, 12.734f)
            curveTo(16.033f, 13.015f, 15.842f, 13.32f, 15.705f, 13.62f)
            curveTo(15.565f, 13.925f, 15.5f, 14.181f, 15.5f, 14.375f)
            curveTo(15.5f, 15.066f, 15.981f, 15.5f, 16.5f, 15.5f)
            curveTo(17.019f, 15.5f, 17.5f, 15.066f, 17.5f, 14.375f)
            curveTo(17.5f, 14.181f, 17.435f, 13.925f, 17.295f, 13.62f)
            curveTo(17.157f, 13.32f, 16.967f, 13.015f, 16.766f, 12.734f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ColorFillPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ColorFill, contentDescription = null)
    }
}
