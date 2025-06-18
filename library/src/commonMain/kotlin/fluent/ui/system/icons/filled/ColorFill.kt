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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.ColorFill: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ColorFill",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.02f, 14f)
            curveTo(13.007f, 14.122f, 13f, 14.248f, 13f, 14.375f)
            curveTo(13f, 16.231f, 14.394f, 18f, 16.5f, 18f)
            curveTo(18.606f, 18f, 20f, 16.231f, 20f, 14.375f)
            curveTo(20f, 14.264f, 19.994f, 14.154f, 19.984f, 14.047f)
            curveTo(21.133f, 14.273f, 22f, 15.285f, 22f, 16.5f)
            verticalLineTo(19.5f)
            curveTo(22f, 20.881f, 20.881f, 22f, 19.5f, 22f)
            horizontalLineTo(4.5f)
            curveTo(3.119f, 22f, 2f, 20.881f, 2f, 19.5f)
            verticalLineTo(16.5f)
            curveTo(2f, 15.119f, 3.119f, 14f, 4.5f, 14f)
            horizontalLineTo(6.586f)
            lineTo(7.493f, 14.907f)
            curveTo(8.664f, 16.079f, 10.564f, 16.079f, 11.735f, 14.907f)
            lineTo(12.642f, 14f)
            horizontalLineTo(13.02f)
            close()
            moveTo(14.342f, 12.994f)
            curveTo(14.154f, 13.403f, 14f, 13.882f, 14f, 14.375f)
            curveTo(14f, 15.765f, 15.029f, 17f, 16.5f, 17f)
            curveTo(17.971f, 17f, 19f, 15.765f, 19f, 14.375f)
            curveTo(19f, 13.882f, 18.846f, 13.403f, 18.658f, 12.994f)
            curveTo(18.468f, 12.578f, 18.22f, 12.188f, 17.984f, 11.859f)
            curveTo(17.747f, 11.529f, 17.511f, 11.247f, 17.335f, 11.048f)
            lineTo(17.03f, 10.72f)
            curveTo(16.737f, 10.427f, 16.263f, 10.427f, 15.97f, 10.72f)
            lineTo(15.964f, 10.725f)
            curveTo(15.906f, 10.787f, 15.75f, 10.951f, 15.665f, 11.048f)
            curveTo(15.489f, 11.247f, 15.253f, 11.529f, 15.016f, 11.859f)
            curveTo(14.78f, 12.188f, 14.533f, 12.578f, 14.342f, 12.994f)
            close()
            moveTo(16.5f, 12.384f)
            curveTo(16.586f, 12.492f, 16.676f, 12.609f, 16.766f, 12.734f)
            curveTo(16.967f, 13.015f, 17.157f, 13.32f, 17.295f, 13.62f)
            curveTo(17.435f, 13.925f, 17.5f, 14.181f, 17.5f, 14.375f)
            curveTo(17.5f, 15.066f, 17.019f, 15.5f, 16.5f, 15.5f)
            curveTo(15.981f, 15.5f, 15.5f, 15.066f, 15.5f, 14.375f)
            curveTo(15.5f, 14.181f, 15.565f, 13.925f, 15.705f, 13.62f)
            curveTo(15.843f, 13.32f, 16.033f, 13.015f, 16.234f, 12.734f)
            curveTo(16.324f, 12.609f, 16.414f, 12.492f, 16.5f, 12.384f)
            close()
            moveTo(9.75f, 1f)
            curveTo(9.336f, 1f, 9f, 1.336f, 9f, 1.75f)
            verticalLineTo(3.506f)
            curveTo(8.968f, 3.534f, 8.937f, 3.563f, 8.907f, 3.593f)
            lineTo(4.664f, 7.836f)
            curveTo(3.883f, 8.617f, 3.883f, 9.883f, 4.664f, 10.664f)
            lineTo(8.2f, 14.2f)
            curveTo(8.981f, 14.981f, 10.247f, 14.981f, 11.028f, 14.2f)
            lineTo(15.271f, 9.957f)
            curveTo(16.052f, 9.176f, 16.052f, 7.91f, 15.271f, 7.129f)
            lineTo(11.735f, 3.593f)
            curveTo(11.39f, 3.248f, 10.951f, 3.056f, 10.5f, 3.015f)
            verticalLineTo(1.75f)
            curveTo(10.5f, 1.336f, 10.164f, 1f, 9.75f, 1f)
            close()
            moveTo(9f, 5.621f)
            verticalLineTo(6.25f)
            curveTo(9f, 6.664f, 9.336f, 7f, 9.75f, 7f)
            curveTo(10.164f, 7f, 10.5f, 6.664f, 10.5f, 6.25f)
            verticalLineTo(4.54f)
            curveTo(10.564f, 4.565f, 10.623f, 4.603f, 10.675f, 4.654f)
            lineTo(14.21f, 8.189f)
            curveTo(14.3f, 8.279f, 14.348f, 8.394f, 14.356f, 8.511f)
            horizontalLineTo(6.111f)
            lineTo(9f, 5.621f)
            close()
            moveTo(9.26f, 13.139f)
            lineTo(6.132f, 10.011f)
            horizontalLineTo(13.096f)
            lineTo(9.968f, 13.139f)
            curveTo(9.772f, 13.334f, 9.456f, 13.334f, 9.26f, 13.139f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ColorFillPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ColorFill, contentDescription = null)
    }
}
