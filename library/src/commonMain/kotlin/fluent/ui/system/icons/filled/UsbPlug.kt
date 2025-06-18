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

public val FluentIcons.Filled.UsbPlug: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.UsbPlug",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 21.248f)
            curveTo(11f, 21.663f, 10.664f, 21.998f, 10.25f, 21.998f)
            curveTo(9.87f, 21.998f, 9.557f, 21.716f, 9.507f, 21.35f)
            lineTo(9.5f, 21.248f)
            lineTo(9.499f, 16.999f)
            lineTo(8.754f, 17f)
            curveTo(7.563f, 17f, 6.588f, 16.075f, 6.509f, 14.904f)
            lineTo(6.504f, 14.75f)
            verticalLineTo(9.25f)
            curveTo(6.504f, 8.265f, 7.136f, 7.428f, 8.017f, 7.123f)
            lineTo(8.016f, 2.747f)
            curveTo(8.016f, 2.367f, 8.299f, 2.054f, 8.665f, 2.004f)
            lineTo(8.766f, 1.997f)
            horizontalLineTo(15.267f)
            curveTo(15.647f, 1.997f, 15.961f, 2.279f, 16.01f, 2.645f)
            lineTo(16.017f, 2.747f)
            lineTo(16.018f, 7.133f)
            curveTo(16.833f, 7.427f, 17.43f, 8.179f, 17.498f, 9.079f)
            lineTo(17.504f, 9.25f)
            verticalLineTo(14.75f)
            curveTo(17.504f, 15.941f, 16.579f, 16.915f, 15.408f, 16.995f)
            lineTo(15.254f, 17f)
            lineTo(14.499f, 16.999f)
            lineTo(14.5f, 21.245f)
            curveTo(14.5f, 21.66f, 14.164f, 21.995f, 13.75f, 21.995f)
            curveTo(13.37f, 21.995f, 13.057f, 21.713f, 13.007f, 21.347f)
            lineTo(13f, 21.245f)
            lineTo(12.999f, 16.999f)
            horizontalLineTo(10.999f)
            lineTo(11f, 21.248f)
            close()
            moveTo(14.517f, 3.497f)
            horizontalLineTo(9.516f)
            verticalLineTo(6.999f)
            horizontalLineTo(14.517f)
            verticalLineTo(3.497f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun UsbPlugPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.UsbPlug, contentDescription = null)
    }
}
