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

public val FluentIcons.Regular.Rocket: ImageVector
    get() {
        if (_Rocket != null) {
            return _Rocket!!
        }
        _Rocket = ImageVector.Builder(
            name = "Regular.Rocket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.057f, 7.431f)
                curveTo(14.033f, 6.454f, 15.616f, 6.454f, 16.593f, 7.431f)
                curveTo(17.569f, 8.407f, 17.569f, 9.99f, 16.593f, 10.966f)
                curveTo(15.616f, 11.943f, 14.033f, 11.943f, 13.057f, 10.966f)
                curveTo(12.081f, 9.99f, 12.081f, 8.407f, 13.057f, 7.431f)
                close()
                moveTo(15.532f, 8.491f)
                curveTo(15.142f, 8.101f, 14.508f, 8.101f, 14.118f, 8.491f)
                curveTo(13.727f, 8.882f, 13.727f, 9.515f, 14.118f, 9.906f)
                curveTo(14.508f, 10.296f, 15.142f, 10.296f, 15.532f, 9.906f)
                curveTo(15.923f, 9.515f, 15.923f, 8.882f, 15.532f, 8.491f)
                close()
                moveTo(21.509f, 4.322f)
                curveTo(21.24f, 3.457f, 20.563f, 2.78f, 19.698f, 2.512f)
                lineTo(19.035f, 2.306f)
                curveTo(16.642f, 1.564f, 14.034f, 2.208f, 12.262f, 3.98f)
                lineTo(11.266f, 4.976f)
                curveTo(9.896f, 3.947f, 7.943f, 4.056f, 6.697f, 5.303f)
                lineTo(5.454f, 6.545f)
                curveTo(5.161f, 6.838f, 5.161f, 7.313f, 5.454f, 7.606f)
                lineTo(7.045f, 9.197f)
                lineTo(6.865f, 9.377f)
                curveTo(6.182f, 10.06f, 6.182f, 11.168f, 6.865f, 11.851f)
                lineTo(7.361f, 12.347f)
                lineTo(5.965f, 13.143f)
                curveTo(5.762f, 13.259f, 5.625f, 13.462f, 5.594f, 13.694f)
                curveTo(5.562f, 13.926f, 5.641f, 14.159f, 5.807f, 14.325f)
                lineTo(9.696f, 18.214f)
                curveTo(9.861f, 18.379f, 10.094f, 18.458f, 10.325f, 18.427f)
                curveTo(10.557f, 18.396f, 10.761f, 18.258f, 10.877f, 18.056f)
                lineTo(11.675f, 16.661f)
                lineTo(12.172f, 17.158f)
                curveTo(12.856f, 17.841f, 13.964f, 17.841f, 14.647f, 17.158f)
                lineTo(14.824f, 16.981f)
                lineTo(16.413f, 18.571f)
                curveTo(16.706f, 18.864f, 17.181f, 18.864f, 17.474f, 18.571f)
                lineTo(18.716f, 17.328f)
                curveTo(19.962f, 16.082f, 20.072f, 14.13f, 19.044f, 12.761f)
                lineTo(20.042f, 11.763f)
                curveTo(21.815f, 9.99f, 22.459f, 7.381f, 21.715f, 4.986f)
                lineTo(21.509f, 4.322f)
                close()
                moveTo(19.253f, 3.944f)
                curveTo(19.646f, 4.067f, 19.954f, 4.374f, 20.076f, 4.767f)
                lineTo(20.283f, 5.432f)
                curveTo(20.861f, 7.294f, 20.36f, 9.323f, 18.982f, 10.702f)
                lineTo(13.586f, 16.097f)
                curveTo(13.489f, 16.195f, 13.33f, 16.195f, 13.233f, 16.097f)
                lineTo(7.926f, 10.791f)
                curveTo(7.829f, 10.693f, 7.829f, 10.535f, 7.926f, 10.437f)
                lineTo(13.323f, 5.041f)
                curveTo(14.701f, 3.662f, 16.729f, 3.161f, 18.591f, 3.739f)
                lineTo(19.253f, 3.944f)
                close()
                moveTo(17.964f, 13.841f)
                curveTo(18.417f, 14.606f, 18.314f, 15.609f, 17.656f, 16.268f)
                lineTo(16.944f, 16.98f)
                lineTo(15.884f, 15.92f)
                lineTo(17.964f, 13.841f)
                close()
                moveTo(7.758f, 6.363f)
                curveTo(8.416f, 5.705f, 9.42f, 5.602f, 10.186f, 6.056f)
                lineTo(8.106f, 8.136f)
                lineTo(7.045f, 7.075f)
                lineTo(7.758f, 6.363f)
                close()
                moveTo(10.576f, 15.561f)
                lineTo(10.062f, 16.459f)
                lineTo(7.562f, 13.959f)
                lineTo(8.46f, 13.446f)
                lineTo(10.576f, 15.561f)
                close()
                moveTo(6.69f, 18.394f)
                curveTo(6.983f, 18.101f, 6.983f, 17.626f, 6.69f, 17.333f)
                curveTo(6.397f, 17.041f, 5.922f, 17.041f, 5.629f, 17.333f)
                lineTo(3.154f, 19.808f)
                curveTo(2.861f, 20.101f, 2.861f, 20.576f, 3.154f, 20.869f)
                curveTo(3.447f, 21.162f, 3.922f, 21.162f, 4.215f, 20.869f)
                lineTo(6.69f, 18.394f)
                close()
                moveTo(4.745f, 15.389f)
                curveTo(5.038f, 15.682f, 5.038f, 16.157f, 4.745f, 16.45f)
                lineTo(3.685f, 17.51f)
                curveTo(3.392f, 17.803f, 2.917f, 17.803f, 2.624f, 17.51f)
                curveTo(2.331f, 17.217f, 2.331f, 16.743f, 2.624f, 16.45f)
                lineTo(3.685f, 15.389f)
                curveTo(3.978f, 15.096f, 4.452f, 15.096f, 4.745f, 15.389f)
                close()
                moveTo(8.632f, 20.341f)
                curveTo(8.925f, 20.048f, 8.925f, 19.573f, 8.632f, 19.28f)
                curveTo(8.34f, 18.987f, 7.865f, 18.987f, 7.572f, 19.28f)
                lineTo(6.513f, 20.339f)
                curveTo(6.22f, 20.632f, 6.22f, 21.107f, 6.513f, 21.399f)
                curveTo(6.806f, 21.692f, 7.281f, 21.692f, 7.574f, 21.399f)
                lineTo(8.632f, 20.341f)
                close()
            }
        }.build()

        return _Rocket!!
    }

@Suppress("ObjectPropertyName")
private var _Rocket: ImageVector? = null

@Preview
@Composable
private fun RocketPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Rocket, contentDescription = null)
    }
}
