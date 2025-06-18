/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.PhoneVibrate: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneVibrate",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.749f, 2f)
            curveTo(16.992f, 2f, 17.999f, 3.007f, 17.999f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(17.999f, 20.993f, 16.992f, 22f, 15.749f, 22f)
            horizontalLineTo(8.249f)
            curveTo(7.006f, 22f, 5.999f, 20.993f, 5.999f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(5.999f, 3.007f, 7.006f, 2f, 8.249f, 2f)
            horizontalLineTo(15.749f)
            close()
            moveTo(13.249f, 18f)
            horizontalLineTo(10.749f)
            curveTo(10.335f, 18f, 9.999f, 18.336f, 9.999f, 18.75f)
            curveTo(9.999f, 19.13f, 10.281f, 19.444f, 10.647f, 19.493f)
            lineTo(10.749f, 19.5f)
            horizontalLineTo(13.249f)
            curveTo(13.663f, 19.5f, 13.999f, 19.164f, 13.999f, 18.75f)
            curveTo(13.999f, 18.336f, 13.663f, 18f, 13.249f, 18f)
            close()
            moveTo(20.128f, 7.572f)
            curveTo(20.604f, 7.381f, 21.14f, 7.583f, 21.378f, 8.023f)
            lineTo(21.427f, 8.129f)
            lineTo(22.01f, 9.585f)
            curveTo(22.373f, 10.492f, 22.27f, 11.515f, 21.744f, 12.328f)
            lineTo(21.625f, 12.499f)
            lineTo(21.473f, 12.701f)
            curveTo(21.29f, 12.945f, 21.23f, 13.257f, 21.305f, 13.549f)
            lineTo(21.345f, 13.672f)
            lineTo(21.927f, 15.129f)
            curveTo(22.133f, 15.641f, 21.883f, 16.223f, 21.371f, 16.428f)
            curveTo(20.894f, 16.619f, 20.358f, 16.417f, 20.12f, 15.977f)
            lineTo(20.071f, 15.871f)
            lineTo(19.488f, 14.415f)
            curveTo(19.125f, 13.508f, 19.228f, 12.485f, 19.754f, 11.672f)
            lineTo(19.874f, 11.501f)
            lineTo(20.025f, 11.299f)
            curveTo(20.208f, 11.055f, 20.268f, 10.743f, 20.193f, 10.451f)
            lineTo(20.153f, 10.328f)
            lineTo(19.571f, 8.871f)
            curveTo(19.365f, 8.359f, 19.615f, 7.777f, 20.128f, 7.572f)
            close()
            moveTo(2.628f, 7.572f)
            curveTo(3.104f, 7.381f, 3.64f, 7.583f, 3.878f, 8.023f)
            lineTo(3.928f, 8.129f)
            lineTo(4.51f, 9.585f)
            curveTo(4.873f, 10.492f, 4.77f, 11.515f, 4.244f, 12.328f)
            lineTo(4.125f, 12.499f)
            lineTo(3.973f, 12.701f)
            curveTo(3.79f, 12.945f, 3.73f, 13.257f, 3.805f, 13.549f)
            lineTo(3.845f, 13.672f)
            lineTo(4.428f, 15.129f)
            curveTo(4.633f, 15.641f, 4.383f, 16.223f, 3.87f, 16.428f)
            curveTo(3.394f, 16.619f, 2.858f, 16.417f, 2.62f, 15.977f)
            lineTo(2.571f, 15.871f)
            lineTo(1.988f, 14.415f)
            curveTo(1.625f, 13.508f, 1.728f, 12.485f, 2.254f, 11.672f)
            lineTo(2.373f, 11.501f)
            lineTo(2.525f, 11.299f)
            curveTo(2.708f, 11.055f, 2.768f, 10.743f, 2.693f, 10.451f)
            lineTo(2.653f, 10.328f)
            lineTo(2.071f, 8.871f)
            curveTo(1.865f, 8.359f, 2.115f, 7.777f, 2.628f, 7.572f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneVibratePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PhoneVibrate, contentDescription = null)
    }
}
