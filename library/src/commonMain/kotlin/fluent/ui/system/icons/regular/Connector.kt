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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.Connector: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Connector",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.252f, 4f)
            curveTo(8.631f, 4f, 8.945f, 4.282f, 8.995f, 4.648f)
            lineTo(9.002f, 4.75f)
            verticalLineTo(7.523f)
            lineTo(10.876f, 10.338f)
            curveTo(10.937f, 10.431f, 10.977f, 10.535f, 10.993f, 10.644f)
            lineTo(11.002f, 10.754f)
            verticalLineTo(15.25f)
            curveTo(11.002f, 15.63f, 10.719f, 15.943f, 10.353f, 15.993f)
            lineTo(10.252f, 16f)
            horizontalLineTo(8.998f)
            lineTo(8.999f, 19.254f)
            curveTo(8.999f, 19.668f, 8.663f, 20.004f, 8.249f, 20.004f)
            curveTo(7.869f, 20.004f, 7.555f, 19.721f, 7.506f, 19.355f)
            lineTo(7.499f, 19.254f)
            lineTo(7.498f, 16f)
            lineTo(5.503f, 15.999f)
            lineTo(5.504f, 19.257f)
            curveTo(5.504f, 19.671f, 5.168f, 20.007f, 4.754f, 20.007f)
            curveTo(4.374f, 20.007f, 4.06f, 19.724f, 4.01f, 19.358f)
            lineTo(4.004f, 19.257f)
            lineTo(4.003f, 15.999f)
            lineTo(2.754f, 16f)
            curveTo(2.374f, 16f, 2.06f, 15.718f, 2.011f, 15.352f)
            lineTo(2.004f, 15.25f)
            verticalLineTo(10.754f)
            curveTo(2.004f, 10.643f, 2.029f, 10.534f, 2.075f, 10.434f)
            lineTo(2.13f, 10.338f)
            lineTo(4.004f, 7.523f)
            verticalLineTo(4.75f)
            curveTo(4.004f, 4.336f, 4.34f, 4f, 4.754f, 4f)
            curveTo(5.134f, 4f, 5.447f, 4.282f, 5.497f, 4.648f)
            lineTo(5.504f, 4.75f)
            verticalLineTo(7.75f)
            curveTo(5.504f, 7.861f, 5.479f, 7.97f, 5.432f, 8.07f)
            lineTo(5.378f, 8.166f)
            lineTo(3.504f, 10.981f)
            verticalLineTo(14.5f)
            horizontalLineTo(9.502f)
            verticalLineTo(10.981f)
            lineTo(7.627f, 8.166f)
            curveTo(7.566f, 8.073f, 7.526f, 7.969f, 7.51f, 7.86f)
            lineTo(7.502f, 7.75f)
            verticalLineTo(4.75f)
            curveTo(7.502f, 4.336f, 7.837f, 4f, 8.252f, 4f)
            close()
            moveTo(15.256f, 4.001f)
            horizontalLineTo(19.752f)
            curveTo(20.131f, 4.001f, 20.445f, 4.284f, 20.495f, 4.65f)
            lineTo(20.502f, 4.751f)
            lineTo(20.501f, 8f)
            horizontalLineTo(21.252f)
            curveTo(21.631f, 8f, 21.945f, 8.282f, 21.995f, 8.648f)
            lineTo(22.002f, 8.75f)
            verticalLineTo(13.246f)
            curveTo(22.002f, 13.357f, 21.977f, 13.466f, 21.93f, 13.566f)
            lineTo(21.876f, 13.662f)
            lineTo(20.002f, 16.477f)
            verticalLineTo(19.25f)
            curveTo(20.002f, 19.664f, 19.666f, 20f, 19.252f, 20f)
            curveTo(18.872f, 20f, 18.558f, 19.718f, 18.508f, 19.352f)
            lineTo(18.502f, 19.25f)
            verticalLineTo(16.25f)
            curveTo(18.502f, 16.139f, 18.526f, 16.03f, 18.573f, 15.93f)
            lineTo(18.627f, 15.834f)
            lineTo(20.502f, 13.019f)
            verticalLineTo(9.5f)
            horizontalLineTo(14.504f)
            verticalLineTo(13.019f)
            lineTo(16.378f, 15.834f)
            curveTo(16.44f, 15.927f, 16.48f, 16.031f, 16.496f, 16.14f)
            lineTo(16.504f, 16.25f)
            verticalLineTo(19.25f)
            curveTo(16.504f, 19.664f, 16.168f, 20f, 15.754f, 20f)
            curveTo(15.374f, 20f, 15.06f, 19.718f, 15.011f, 19.352f)
            lineTo(15.004f, 19.25f)
            verticalLineTo(16.477f)
            lineTo(13.13f, 13.662f)
            curveTo(13.068f, 13.569f, 13.028f, 13.465f, 13.012f, 13.356f)
            lineTo(13.004f, 13.246f)
            verticalLineTo(8.75f)
            curveTo(13.004f, 8.37f, 13.286f, 8.057f, 13.652f, 8.007f)
            lineTo(13.754f, 8f)
            horizontalLineTo(14.506f)
            lineTo(14.506f, 4.751f)
            curveTo(14.506f, 4.372f, 14.788f, 4.058f, 15.154f, 4.008f)
            lineTo(15.256f, 4.001f)
            horizontalLineTo(19.752f)
            horizontalLineTo(15.256f)
            close()
            moveTo(19.002f, 5.501f)
            horizontalLineTo(16.006f)
            lineTo(16.006f, 8f)
            horizontalLineTo(19.001f)
            lineTo(19.002f, 5.501f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ConnectorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Connector, contentDescription = null)
    }
}
