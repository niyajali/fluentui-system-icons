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

public val FluentIcons.Filled.PaintBrushSparkle: ImageVector
    get() {
        if (_PaintBrushSparkle != null) {
            return _PaintBrushSparkle!!
        }
        _PaintBrushSparkle = ImageVector.Builder(
            name = "Filled.PaintBrushSparkle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.854f, 15.146f)
                curveTo(13.938f, 15.23f, 14.016f, 15.319f, 14.088f, 15.412f)
                curveTo(14.285f, 15.667f, 14.438f, 15.953f, 14.539f, 16.26f)
                lineTo(14.987f, 17.637f)
                curveTo(15.024f, 17.743f, 15.094f, 17.835f, 15.186f, 17.9f)
                curveTo(15.278f, 17.965f, 15.387f, 18f, 15.5f, 18f)
                curveTo(15.613f, 18f, 15.722f, 17.965f, 15.814f, 17.9f)
                curveTo(15.896f, 17.842f, 15.96f, 17.763f, 16f, 17.671f)
                curveTo(16.005f, 17.66f, 16.009f, 17.649f, 16.013f, 17.637f)
                lineTo(16.461f, 16.26f)
                curveTo(16.6f, 15.842f, 16.835f, 15.462f, 17.147f, 15.15f)
                curveTo(17.459f, 14.838f, 17.84f, 14.603f, 18.259f, 14.464f)
                lineTo(19.637f, 14.016f)
                curveTo(19.743f, 13.979f, 19.835f, 13.909f, 19.9f, 13.818f)
                curveTo(19.965f, 13.726f, 20f, 13.616f, 20f, 13.503f)
                curveTo(20f, 13.391f, 19.965f, 13.281f, 19.9f, 13.189f)
                curveTo(19.835f, 13.097f, 19.743f, 13.028f, 19.637f, 12.991f)
                lineTo(19.609f, 12.984f)
                lineTo(18.232f, 12.536f)
                curveTo(17.813f, 12.397f, 17.432f, 12.162f, 17.12f, 11.85f)
                curveTo(16.808f, 11.538f, 16.573f, 11.158f, 16.434f, 10.74f)
                lineTo(15.986f, 9.363f)
                curveTo(15.948f, 9.257f, 15.879f, 9.165f, 15.787f, 9.1f)
                curveTo(15.695f, 9.035f, 15.585f, 9f, 15.472f, 9f)
                curveTo(15.36f, 9f, 15.25f, 9.035f, 15.158f, 9.1f)
                curveTo(15.066f, 9.165f, 14.997f, 9.257f, 14.959f, 9.363f)
                lineTo(14.511f, 10.74f)
                lineTo(14.5f, 10.774f)
                curveTo(14.362f, 11.176f, 14.136f, 11.542f, 13.837f, 11.845f)
                curveTo(13.53f, 12.157f, 13.155f, 12.394f, 12.741f, 12.536f)
                lineTo(11.363f, 12.984f)
                curveTo(11.257f, 13.021f, 11.165f, 13.091f, 11.1f, 13.182f)
                curveTo(11.035f, 13.274f, 11f, 13.384f, 11f, 13.497f)
                curveTo(11f, 13.609f, 11.035f, 13.719f, 11.1f, 13.811f)
                curveTo(11.165f, 13.903f, 11.257f, 13.972f, 11.363f, 14.009f)
                lineTo(12.741f, 14.457f)
                curveTo(13.161f, 14.597f, 13.542f, 14.833f, 13.854f, 15.146f)
                close()
                moveTo(22.017f, 18.965f)
                lineTo(22.783f, 19.213f)
                lineTo(22.798f, 19.217f)
                curveTo(22.857f, 19.238f, 22.908f, 19.276f, 22.944f, 19.327f)
                curveTo(22.981f, 19.378f, 23f, 19.439f, 23f, 19.502f)
                curveTo(23f, 19.564f, 22.981f, 19.625f, 22.944f, 19.676f)
                curveTo(22.908f, 19.728f, 22.857f, 19.766f, 22.798f, 19.787f)
                lineTo(22.033f, 20.035f)
                curveTo(21.8f, 20.113f, 21.589f, 20.243f, 21.415f, 20.416f)
                curveTo(21.242f, 20.59f, 21.111f, 20.801f, 21.034f, 21.034f)
                lineTo(20.785f, 21.798f)
                curveTo(20.764f, 21.857f, 20.726f, 21.908f, 20.675f, 21.944f)
                curveTo(20.624f, 21.981f, 20.563f, 22f, 20.5f, 22f)
                curveTo(20.437f, 22f, 20.376f, 21.981f, 20.325f, 21.944f)
                curveTo(20.274f, 21.908f, 20.236f, 21.857f, 20.215f, 21.798f)
                lineTo(19.966f, 21.034f)
                curveTo(19.889f, 20.8f, 19.759f, 20.588f, 19.586f, 20.414f)
                curveTo(19.412f, 20.24f, 19.2f, 20.109f, 18.967f, 20.032f)
                lineTo(18.202f, 19.783f)
                curveTo(18.143f, 19.762f, 18.092f, 19.724f, 18.056f, 19.673f)
                curveTo(18.019f, 19.622f, 18f, 19.561f, 18f, 19.498f)
                curveTo(18f, 19.436f, 18.019f, 19.375f, 18.056f, 19.324f)
                curveTo(18.092f, 19.272f, 18.143f, 19.234f, 18.202f, 19.213f)
                lineTo(18.967f, 18.965f)
                curveTo(19.197f, 18.885f, 19.406f, 18.754f, 19.576f, 18.581f)
                curveTo(19.747f, 18.408f, 19.875f, 18.197f, 19.951f, 17.966f)
                lineTo(20.2f, 17.202f)
                curveTo(20.22f, 17.143f, 20.259f, 17.092f, 20.31f, 17.056f)
                curveTo(20.361f, 17.019f, 20.422f, 17f, 20.485f, 17f)
                curveTo(20.547f, 17f, 20.608f, 17.019f, 20.659f, 17.056f)
                curveTo(20.71f, 17.092f, 20.749f, 17.143f, 20.77f, 17.202f)
                lineTo(21.019f, 17.966f)
                curveTo(21.096f, 18.199f, 21.226f, 18.41f, 21.4f, 18.584f)
                curveTo(21.573f, 18.757f, 21.785f, 18.887f, 22.017f, 18.965f)
                close()
                moveTo(12.5f, 5.252f)
                verticalLineTo(2f)
                horizontalLineTo(5.75f)
                curveTo(5.336f, 2f, 5f, 2.336f, 5f, 2.75f)
                verticalLineTo(11f)
                horizontalLineTo(13.252f)
                curveTo(13.383f, 10.836f, 13.485f, 10.651f, 13.553f, 10.452f)
                lineTo(13.562f, 10.426f)
                lineTo(14.012f, 9.042f)
                lineTo(14.016f, 9.03f)
                curveTo(14.123f, 8.729f, 14.32f, 8.468f, 14.581f, 8.283f)
                curveTo(14.842f, 8.099f, 15.153f, 8f, 15.472f, 8f)
                curveTo(15.792f, 8f, 16.103f, 8.099f, 16.364f, 8.283f)
                curveTo(16.625f, 8.468f, 16.822f, 8.729f, 16.929f, 9.03f)
                lineTo(16.933f, 9.042f)
                lineTo(17.383f, 10.427f)
                curveTo(17.453f, 10.636f, 17.56f, 10.83f, 17.698f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(2.75f)
                curveTo(19f, 2.336f, 18.664f, 2f, 18.25f, 2f)
                horizontalLineTo(16.5f)
                verticalLineTo(6.251f)
                curveTo(16.5f, 6.665f, 16.164f, 7.001f, 15.75f, 7.001f)
                curveTo(15.335f, 7.001f, 15f, 6.665f, 15f, 6.251f)
                verticalLineTo(2f)
                horizontalLineTo(14f)
                verticalLineTo(5.252f)
                curveTo(14f, 5.666f, 13.664f, 6.002f, 13.25f, 6.002f)
                curveTo(12.835f, 6.002f, 12.5f, 5.666f, 12.5f, 5.252f)
                close()
                moveTo(10.365f, 12.5f)
                horizontalLineTo(5f)
                verticalLineTo(14.252f)
                curveTo(5f, 15.495f, 6.007f, 16.502f, 7.25f, 16.502f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                curveTo(10f, 21.105f, 10.895f, 22f, 12f, 22f)
                curveTo(13.104f, 22f, 14f, 21.105f, 14f, 20f)
                verticalLineTo(17.835f)
                lineTo(13.589f, 16.573f)
                lineTo(13.589f, 16.572f)
                curveTo(13.523f, 16.374f, 13.425f, 16.189f, 13.297f, 16.024f)
                curveTo(13.251f, 15.964f, 13.2f, 15.906f, 13.146f, 15.852f)
                curveTo(12.944f, 15.65f, 12.699f, 15.497f, 12.428f, 15.407f)
                lineTo(11.042f, 14.957f)
                lineTo(11.031f, 14.953f)
                curveTo(10.729f, 14.846f, 10.469f, 14.649f, 10.284f, 14.389f)
                curveTo(10.099f, 14.128f, 10f, 13.816f, 10f, 13.497f)
                curveTo(10f, 13.177f, 10.099f, 12.865f, 10.284f, 12.604f)
                curveTo(10.309f, 12.568f, 10.337f, 12.534f, 10.365f, 12.5f)
                close()
            }
        }.build()

        return _PaintBrushSparkle!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrushSparkle: ImageVector? = null

@Preview
@Composable
private fun PaintBrushSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PaintBrushSparkle, contentDescription = null)
    }
}
