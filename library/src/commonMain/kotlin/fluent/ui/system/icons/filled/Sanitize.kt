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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.Sanitize: ImageVector
    get() {
        if (_Sanitize != null) {
            return _Sanitize!!
        }
        _Sanitize = ImageVector.Builder(
            name = "Filled.Sanitize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.621f, 10.621f)
                curveTo(2.45f, 9.449f, 2.45f, 7.55f, 3.621f, 6.378f)
                lineTo(6.879f, 3.121f)
                curveTo(8.05f, 1.949f, 9.95f, 1.949f, 11.121f, 3.121f)
                lineTo(14.788f, 6.787f)
                curveTo(14.742f, 6.857f, 14.701f, 6.931f, 14.665f, 7.007f)
                curveTo(14.399f, 6.844f, 14.085f, 6.75f, 13.75f, 6.75f)
                curveTo(12.783f, 6.75f, 12f, 7.533f, 12f, 8.5f)
                verticalLineTo(13.027f)
                curveTo(11.837f, 13.007f, 11.669f, 12.996f, 11.5f, 12.996f)
                curveTo(10.835f, 12.996f, 10.254f, 13.161f, 9.806f, 13.387f)
                curveTo(9.587f, 13.498f, 9.361f, 13.641f, 9.162f, 13.823f)
                curveTo(9.129f, 13.853f, 9.092f, 13.889f, 9.053f, 13.929f)
                curveTo(8.978f, 14.006f, 8.897f, 14.101f, 8.821f, 14.215f)
                curveTo(8.733f, 14.346f, 8.5f, 14.718f, 8.5f, 15.25f)
                curveTo(8.5f, 15.341f, 8.507f, 15.432f, 8.521f, 15.521f)
                lineTo(3.621f, 10.621f)
                close()
                moveTo(17f, 7.75f)
                verticalLineTo(13.5f)
                curveTo(17f, 13.776f, 17.224f, 14f, 17.5f, 14f)
                curveTo(17.776f, 14f, 18f, 13.776f, 18f, 13.5f)
                verticalLineTo(8.5f)
                curveTo(18f, 8.085f, 18.336f, 7.75f, 18.75f, 7.75f)
                curveTo(19.164f, 7.75f, 19.5f, 8.085f, 19.5f, 8.5f)
                verticalLineTo(13.997f)
                curveTo(19.5f, 14.274f, 19.724f, 14.497f, 20f, 14.497f)
                curveTo(20.276f, 14.497f, 20.5f, 14.274f, 20.5f, 13.997f)
                verticalLineTo(9.75f)
                curveTo(20.5f, 9.335f, 20.836f, 9f, 21.25f, 9f)
                curveTo(21.664f, 9f, 22f, 9.335f, 22f, 9.75f)
                verticalLineTo(16.75f)
                curveTo(22f, 17.373f, 21.726f, 18.135f, 21.44f, 18.786f)
                curveTo(21.139f, 19.471f, 20.765f, 20.162f, 20.463f, 20.688f)
                curveTo(19.982f, 21.527f, 19.089f, 22f, 18.158f, 22f)
                horizontalLineTo(17.019f)
                curveTo(16.139f, 22f, 15.311f, 21.578f, 14.794f, 20.865f)
                lineTo(13.417f, 18.968f)
                lineTo(11.759f, 17.077f)
                lineTo(9.852f, 15.885f)
                curveTo(9.633f, 15.748f, 9.5f, 15.508f, 9.5f, 15.25f)
                curveTo(9.5f, 15.013f, 9.604f, 14.842f, 9.65f, 14.773f)
                curveTo(9.709f, 14.686f, 9.777f, 14.616f, 9.835f, 14.562f)
                curveTo(9.954f, 14.454f, 10.099f, 14.359f, 10.256f, 14.28f)
                curveTo(10.573f, 14.12f, 11f, 13.996f, 11.5f, 13.996f)
                curveTo(12.029f, 13.996f, 12.57f, 14.149f, 13.003f, 14.313f)
                curveTo(13.001f, 14.292f, 13f, 14.271f, 13f, 14.25f)
                verticalLineTo(8.5f)
                curveTo(13f, 8.085f, 13.336f, 7.75f, 13.75f, 7.75f)
                curveTo(14.164f, 7.75f, 14.5f, 8.085f, 14.5f, 8.5f)
                verticalLineTo(13.5f)
                curveTo(14.5f, 13.776f, 14.724f, 14f, 15f, 14f)
                curveTo(15.276f, 14f, 15.5f, 13.776f, 15.5f, 13.5f)
                verticalLineTo(7.75f)
                curveTo(15.5f, 7.335f, 15.836f, 7f, 16.25f, 7f)
                curveTo(16.664f, 7f, 17f, 7.335f, 17f, 7.75f)
                close()
                moveTo(4.251f, 14f)
                curveTo(4.666f, 14f, 5.001f, 14.335f, 5.001f, 14.75f)
                lineTo(5.001f, 15.497f)
                horizontalLineTo(5.747f)
                curveTo(6.161f, 15.497f, 6.497f, 15.833f, 6.497f, 16.247f)
                curveTo(6.497f, 16.662f, 6.161f, 16.997f, 5.747f, 16.997f)
                horizontalLineTo(5.001f)
                lineTo(5.001f, 17.753f)
                curveTo(5.001f, 18.167f, 4.666f, 18.503f, 4.251f, 18.503f)
                curveTo(3.837f, 18.503f, 3.501f, 18.167f, 3.501f, 17.753f)
                lineTo(3.501f, 16.997f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 16.997f, 2f, 16.662f, 2f, 16.247f)
                curveTo(2f, 15.833f, 2.336f, 15.497f, 2.75f, 15.497f)
                horizontalLineTo(3.501f)
                lineTo(3.501f, 14.75f)
                curveTo(3.501f, 14.335f, 3.837f, 14f, 4.251f, 14f)
                close()
                moveTo(9.001f, 18.25f)
                curveTo(9.001f, 17.835f, 8.666f, 17.5f, 8.251f, 17.5f)
                curveTo(7.837f, 17.5f, 7.501f, 17.835f, 7.501f, 18.25f)
                lineTo(7.501f, 18.997f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 18.997f, 6f, 19.333f, 6f, 19.747f)
                curveTo(6f, 20.162f, 6.336f, 20.497f, 6.75f, 20.497f)
                horizontalLineTo(7.501f)
                lineTo(7.501f, 21.253f)
                curveTo(7.501f, 21.667f, 7.837f, 22.003f, 8.251f, 22.003f)
                curveTo(8.666f, 22.003f, 9.001f, 21.667f, 9.001f, 21.253f)
                lineTo(9.001f, 20.497f)
                horizontalLineTo(9.747f)
                curveTo(10.161f, 20.497f, 10.497f, 20.162f, 10.497f, 19.747f)
                curveTo(10.497f, 19.333f, 10.161f, 18.997f, 9.747f, 18.997f)
                horizontalLineTo(9.001f)
                lineTo(9.001f, 18.25f)
                close()
            }
        }.build()

        return _Sanitize!!
    }

@Suppress("ObjectPropertyName")
private var _Sanitize: ImageVector? = null

@Preview
@Composable
private fun SanitizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Sanitize, contentDescription = null)
    }
}
