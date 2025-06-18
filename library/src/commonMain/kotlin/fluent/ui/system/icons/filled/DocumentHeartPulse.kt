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

public val FluentIcons.Filled.DocumentHeartPulse: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentHeartPulse",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            verticalLineTo(8f)
            curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
            horizontalLineTo(20f)
            verticalLineTo(20.5f)
            curveTo(20f, 21.328f, 19.328f, 22f, 18.5f, 22f)
            horizontalLineTo(9.73f)
            lineTo(12.307f, 19.424f)
            lineTo(12.326f, 19.404f)
            lineTo(12.673f, 19.056f)
            curveTo(14.472f, 17.258f, 14.472f, 14.343f, 12.673f, 12.545f)
            curveTo(11.146f, 11.017f, 8.813f, 10.787f, 7.043f, 11.854f)
            curveTo(6.122f, 11.28f, 5.042f, 11.062f, 4f, 11.2f)
            verticalLineTo(3.5f)
            curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineTo(12f)
            close()
            moveTo(13.5f, 2.5f)
            verticalLineTo(8f)
            curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
            horizontalLineTo(19.5f)
            lineTo(13.5f, 2.5f)
            close()
            moveTo(2.062f, 13.216f)
            curveTo(3.428f, 11.849f, 5.619f, 11.809f, 7.034f, 13.096f)
            curveTo(8.45f, 11.846f, 10.613f, 11.898f, 11.966f, 13.252f)
            curveTo(12.721f, 14.006f, 13.071f, 15.012f, 13.017f, 16f)
            horizontalLineTo(10.975f)
            lineTo(10.237f, 15.263f)
            curveTo(9.897f, 14.922f, 9.43f, 14.737f, 8.949f, 14.751f)
            curveTo(8.467f, 14.765f, 8.012f, 14.977f, 7.692f, 15.337f)
            lineTo(7.198f, 15.893f)
            lineTo(6.456f, 14.779f)
            curveTo(6.11f, 14.26f, 5.514f, 13.965f, 4.891f, 14.003f)
            curveTo(4.269f, 14.042f, 3.714f, 14.409f, 3.435f, 14.967f)
            lineTo(2.918f, 16f)
            horizontalLineTo(1.014f)
            curveTo(0.949f, 15.001f, 1.298f, 13.979f, 2.062f, 13.216f)
            close()
            moveTo(3.248f, 19.5f)
            lineTo(6.501f, 22.754f)
            curveTo(6.658f, 22.91f, 6.866f, 22.983f, 7.07f, 22.972f)
            curveTo(7.249f, 22.963f, 7.426f, 22.89f, 7.562f, 22.754f)
            lineTo(10.816f, 19.5f)
            horizontalLineTo(8.675f)
            lineTo(8.308f, 19.913f)
            curveTo(7.948f, 20.318f, 7.42f, 20.533f, 6.879f, 20.496f)
            curveTo(6.338f, 20.458f, 5.845f, 20.172f, 5.544f, 19.721f)
            lineTo(5.397f, 19.5f)
            horizontalLineTo(3.248f)
            close()
            moveTo(5.624f, 15.334f)
            curveTo(5.476f, 15.111f, 5.22f, 14.985f, 4.953f, 15.001f)
            curveTo(4.687f, 15.018f, 4.449f, 15.175f, 4.329f, 15.415f)
            lineTo(3.536f, 17f)
            horizontalLineTo(1.75f)
            curveTo(1.336f, 17f, 1f, 17.336f, 1f, 17.75f)
            curveTo(1f, 18.164f, 1.336f, 18.5f, 1.75f, 18.5f)
            horizontalLineTo(4f)
            curveTo(4.284f, 18.5f, 4.544f, 18.34f, 4.671f, 18.085f)
            lineTo(5.093f, 17.241f)
            lineTo(6.376f, 19.166f)
            curveTo(6.505f, 19.359f, 6.716f, 19.482f, 6.948f, 19.498f)
            curveTo(7.18f, 19.514f, 7.406f, 19.422f, 7.561f, 19.248f)
            lineTo(9.032f, 17.593f)
            lineTo(9.72f, 18.28f)
            curveTo(9.86f, 18.421f, 10.051f, 18.5f, 10.25f, 18.5f)
            horizontalLineTo(12.25f)
            curveTo(12.664f, 18.5f, 13f, 18.164f, 13f, 17.75f)
            curveTo(13f, 17.336f, 12.664f, 17f, 12.25f, 17f)
            horizontalLineTo(10.561f)
            lineTo(9.53f, 15.97f)
            curveTo(9.384f, 15.824f, 9.184f, 15.744f, 8.978f, 15.75f)
            curveTo(8.771f, 15.756f, 8.577f, 15.847f, 8.439f, 16.002f)
            lineTo(7.085f, 17.525f)
            lineTo(5.624f, 15.334f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentHeartPulsePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentHeartPulse, contentDescription = null)
    }
}
