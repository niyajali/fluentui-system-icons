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

public val FluentIcons.Regular.DesktopSpeaker: ImageVector
    get() {
        if (_DesktopSpeaker != null) {
            return _DesktopSpeaker!!
        }
        _DesktopSpeaker = ImageVector.Builder(
            name = "Regular.DesktopSpeaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(22.143f, 2.302f)
                curveTo(21.815f, 1.755f, 21.478f, 1.381f, 21.23f, 1.174f)
                curveTo(20.912f, 0.909f, 20.439f, 0.952f, 20.174f, 1.27f)
                curveTo(19.909f, 1.588f, 19.952f, 2.061f, 20.27f, 2.326f)
                curveTo(20.397f, 2.432f, 20.623f, 2.683f, 20.857f, 3.073f)
                curveTo(21.258f, 3.742f, 21.5f, 4.548f, 21.5f, 5.5f)
                curveTo(21.5f, 6.452f, 21.258f, 7.258f, 20.857f, 7.927f)
                curveTo(20.623f, 8.317f, 20.397f, 8.568f, 20.27f, 8.674f)
                curveTo(19.952f, 8.939f, 19.909f, 9.412f, 20.174f, 9.73f)
                curveTo(20.439f, 10.048f, 20.912f, 10.091f, 21.23f, 9.826f)
                curveTo(21.478f, 9.619f, 21.815f, 9.245f, 22.143f, 8.698f)
                curveTo(22.679f, 7.805f, 23f, 6.736f, 23f, 5.5f)
                curveTo(23f, 4.264f, 22.679f, 3.195f, 22.143f, 2.302f)
                close()
                moveTo(19.874f, 3.396f)
                curveTo(19.635f, 3.038f, 19.389f, 2.791f, 19.2f, 2.65f)
                curveTo(18.869f, 2.401f, 18.399f, 2.469f, 18.15f, 2.8f)
                curveTo(17.902f, 3.131f, 17.969f, 3.601f, 18.3f, 3.85f)
                curveTo(18.362f, 3.896f, 18.49f, 4.025f, 18.626f, 4.229f)
                curveTo(18.86f, 4.58f, 19f, 5f, 19f, 5.5f)
                curveTo(19f, 6f, 18.86f, 6.421f, 18.626f, 6.771f)
                curveTo(18.49f, 6.975f, 18.362f, 7.104f, 18.3f, 7.15f)
                lineTo(18.216f, 7.223f)
                curveTo(17.959f, 7.483f, 17.924f, 7.899f, 18.15f, 8.2f)
                curveTo(18.399f, 8.531f, 18.869f, 8.599f, 19.2f, 8.35f)
                curveTo(19.389f, 8.209f, 19.635f, 7.962f, 19.874f, 7.604f)
                curveTo(20.265f, 7.017f, 20.5f, 6.312f, 20.5f, 5.5f)
                curveTo(20.5f, 4.688f, 20.265f, 3.983f, 19.874f, 3.396f)
                close()
                moveTo(17f, 2.75f)
                curveTo(17f, 2.438f, 16.806f, 2.158f, 16.514f, 2.048f)
                curveTo(16.221f, 1.938f, 15.891f, 2.021f, 15.686f, 2.256f)
                lineTo(14.16f, 4f)
                horizontalLineTo(12.75f)
                curveTo(12.336f, 4f, 12f, 4.336f, 12f, 4.75f)
                verticalLineTo(6.25f)
                curveTo(12f, 6.664f, 12.336f, 7f, 12.75f, 7f)
                horizontalLineTo(14.16f)
                lineTo(15.686f, 8.744f)
                curveTo(15.891f, 8.979f, 16.221f, 9.062f, 16.514f, 8.952f)
                curveTo(16.806f, 8.842f, 17f, 8.562f, 17f, 8.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(4.25f, 3f)
                horizontalLineTo(11.979f)
                curveTo(11.436f, 3.011f, 11f, 3.454f, 11f, 4f)
                verticalLineTo(4.5f)
                horizontalLineTo(4.25f)
                curveTo(3.87f, 4.5f, 3.557f, 4.782f, 3.507f, 5.148f)
                lineTo(3.5f, 5.25f)
                verticalLineTo(15.752f)
                curveTo(3.5f, 16.132f, 3.782f, 16.446f, 4.148f, 16.495f)
                lineTo(4.25f, 16.502f)
                horizontalLineTo(19.749f)
                curveTo(20.128f, 16.502f, 20.442f, 16.22f, 20.492f, 15.854f)
                lineTo(20.499f, 15.752f)
                verticalLineTo(10.982f)
                curveTo(20.973f, 11.051f, 21.473f, 10.925f, 21.87f, 10.594f)
                curveTo(21.912f, 10.559f, 21.955f, 10.522f, 21.999f, 10.482f)
                verticalLineTo(15.752f)
                curveTo(21.999f, 16.943f, 21.074f, 17.918f, 19.903f, 17.997f)
                lineTo(19.749f, 18.002f)
                lineTo(15.499f, 18.002f)
                verticalLineTo(20.5f)
                lineTo(17.25f, 20.5f)
                curveTo(17.664f, 20.5f, 18f, 20.836f, 18f, 21.25f)
                curveTo(18f, 21.63f, 17.718f, 21.944f, 17.352f, 21.994f)
                lineTo(17.25f, 22f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 22f, 6f, 21.665f, 6f, 21.25f)
                curveTo(6f, 20.871f, 6.282f, 20.557f, 6.648f, 20.507f)
                lineTo(6.75f, 20.5f)
                lineTo(8.499f, 20.5f)
                verticalLineTo(18.002f)
                lineTo(4.25f, 18.002f)
                curveTo(3.059f, 18.002f, 2.084f, 17.077f, 2.005f, 15.906f)
                lineTo(2f, 15.752f)
                verticalLineTo(5.25f)
                curveTo(2f, 4.059f, 2.925f, 3.084f, 4.096f, 3.005f)
                lineTo(4.25f, 3f)
                close()
                moveTo(13.998f, 18.002f)
                horizontalLineTo(9.998f)
                lineTo(9.999f, 20.5f)
                horizontalLineTo(13.999f)
                lineTo(13.998f, 18.002f)
                close()
            }
        }.build()

        return _DesktopSpeaker!!
    }

@Suppress("ObjectPropertyName")
private var _DesktopSpeaker: ImageVector? = null

@Preview
@Composable
private fun DesktopSpeakerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DesktopSpeaker, contentDescription = null)
    }
}
