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

public val FluentUi.Regular.DesktopSync: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DesktopSync",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 6.5f)
            curveTo(12f, 9.538f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 9.538f, 23f, 6.5f)
            curveTo(23f, 3.462f, 20.538f, 1f, 17.5f, 1f)
            curveTo(14.462f, 1f, 12f, 3.462f, 12f, 6.5f)
            close()
            moveTo(20.5f, 3f)
            curveTo(20.776f, 3f, 21f, 3.224f, 21f, 3.5f)
            verticalLineTo(5.5f)
            curveTo(21f, 5.776f, 20.776f, 6f, 20.5f, 6f)
            horizontalLineTo(18.5f)
            curveTo(18.224f, 6f, 18f, 5.776f, 18f, 5.5f)
            curveTo(18f, 5.224f, 18.224f, 5f, 18.5f, 5f)
            horizontalLineTo(19.5f)
            curveTo(19.044f, 4.392f, 18.317f, 4f, 17.5f, 4f)
            curveTo(16.667f, 4f, 15.928f, 4.407f, 15.473f, 5.036f)
            curveTo(15.311f, 5.26f, 14.999f, 5.31f, 14.775f, 5.148f)
            curveTo(14.551f, 4.986f, 14.501f, 4.673f, 14.663f, 4.45f)
            curveTo(15.298f, 3.572f, 16.332f, 3f, 17.5f, 3f)
            curveTo(18.48f, 3f, 19.365f, 3.403f, 20f, 4.051f)
            verticalLineTo(3.5f)
            curveTo(20f, 3.224f, 20.224f, 3f, 20.5f, 3f)
            close()
            moveTo(15f, 8.949f)
            verticalLineTo(9.5f)
            curveTo(15f, 9.776f, 14.776f, 10f, 14.5f, 10f)
            curveTo(14.224f, 10f, 14f, 9.776f, 14f, 9.5f)
            verticalLineTo(7.5f)
            curveTo(14f, 7.224f, 14.224f, 7f, 14.5f, 7f)
            horizontalLineTo(16.5f)
            curveTo(16.776f, 7f, 17f, 7.224f, 17f, 7.5f)
            curveTo(17f, 7.776f, 16.776f, 8f, 16.5f, 8f)
            horizontalLineTo(15.5f)
            curveTo(15.956f, 8.608f, 16.683f, 9f, 17.5f, 9f)
            curveTo(18.266f, 9f, 18.952f, 8.656f, 19.411f, 8.112f)
            curveTo(19.589f, 7.901f, 19.905f, 7.874f, 20.116f, 8.052f)
            curveTo(20.327f, 8.231f, 20.353f, 8.546f, 20.175f, 8.757f)
            curveTo(19.534f, 9.516f, 18.573f, 10f, 17.5f, 10f)
            curveTo(16.52f, 10f, 15.635f, 9.597f, 15f, 8.949f)
            close()
            moveTo(20.499f, 15.752f)
            verticalLineTo(12.268f)
            curveTo(21.05f, 11.981f, 21.555f, 11.618f, 21.999f, 11.191f)
            verticalLineTo(15.752f)
            curveTo(21.999f, 16.943f, 21.074f, 17.917f, 19.903f, 17.997f)
            lineTo(19.749f, 18.002f)
            lineTo(15.499f, 18.001f)
            verticalLineTo(20.5f)
            lineTo(17.25f, 20.5f)
            curveTo(17.664f, 20.5f, 18f, 20.836f, 18f, 21.25f)
            curveTo(18f, 21.63f, 17.718f, 21.943f, 17.352f, 21.993f)
            lineTo(17.25f, 22f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 22f, 6f, 21.664f, 6f, 21.25f)
            curveTo(6f, 20.87f, 6.282f, 20.556f, 6.648f, 20.507f)
            lineTo(6.75f, 20.5f)
            lineTo(8.499f, 20.5f)
            verticalLineTo(18.001f)
            lineTo(4.25f, 18.002f)
            curveTo(3.059f, 18.002f, 2.084f, 17.077f, 2.005f, 15.906f)
            lineTo(2f, 15.752f)
            verticalLineTo(5.25f)
            curveTo(2f, 4.059f, 2.925f, 3.084f, 4.096f, 3.005f)
            lineTo(4.25f, 3f)
            horizontalLineTo(12.022f)
            curveTo(11.726f, 3.463f, 11.486f, 3.966f, 11.314f, 4.5f)
            horizontalLineTo(4.25f)
            curveTo(3.87f, 4.5f, 3.557f, 4.782f, 3.507f, 5.148f)
            lineTo(3.5f, 5.25f)
            verticalLineTo(15.752f)
            curveTo(3.5f, 16.132f, 3.782f, 16.445f, 4.148f, 16.495f)
            lineTo(4.25f, 16.502f)
            horizontalLineTo(19.749f)
            curveTo(20.128f, 16.502f, 20.442f, 16.22f, 20.492f, 15.854f)
            lineTo(20.499f, 15.752f)
            close()
            moveTo(13.998f, 18.001f)
            horizontalLineTo(9.998f)
            lineTo(9.999f, 20.5f)
            horizontalLineTo(13.999f)
            lineTo(13.998f, 18.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DesktopSyncPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DesktopSync, contentDescription = null)
    }
}
