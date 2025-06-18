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
package fluent.ui.system.icons.light

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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Light.MailArrowDoubleBack: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.MailArrowDoubleBack",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23.5f, 16f)
            curveTo(27.642f, 16f, 31f, 12.642f, 31f, 8.5f)
            curveTo(31f, 4.358f, 27.642f, 1f, 23.5f, 1f)
            curveTo(19.358f, 1f, 16f, 4.358f, 16f, 8.5f)
            curveTo(16f, 12.642f, 19.358f, 16f, 23.5f, 16f)
            close()
            moveTo(20.22f, 5.22f)
            curveTo(20.513f, 4.927f, 20.987f, 4.927f, 21.28f, 5.22f)
            curveTo(21.573f, 5.513f, 21.573f, 5.987f, 21.28f, 6.28f)
            lineTo(19.311f, 8.25f)
            lineTo(21.28f, 10.22f)
            curveTo(21.573f, 10.513f, 21.573f, 10.987f, 21.28f, 11.28f)
            curveTo(20.987f, 11.573f, 20.513f, 11.573f, 20.22f, 11.28f)
            lineTo(17.72f, 8.78f)
            curveTo(17.427f, 8.487f, 17.427f, 8.013f, 17.72f, 7.72f)
            lineTo(20.22f, 5.22f)
            close()
            moveTo(25.28f, 5.22f)
            curveTo(25.573f, 5.513f, 25.573f, 5.987f, 25.28f, 6.28f)
            lineTo(24.061f, 7.5f)
            horizontalLineTo(26.25f)
            curveTo(27.769f, 7.5f, 29f, 8.731f, 29f, 10.25f)
            verticalLineTo(10.75f)
            curveTo(29f, 11.164f, 28.664f, 11.5f, 28.25f, 11.5f)
            curveTo(27.836f, 11.5f, 27.5f, 11.164f, 27.5f, 10.75f)
            verticalLineTo(10.25f)
            curveTo(27.5f, 9.56f, 26.94f, 9f, 26.25f, 9f)
            horizontalLineTo(24.061f)
            lineTo(25.28f, 10.22f)
            curveTo(25.573f, 10.513f, 25.573f, 10.987f, 25.28f, 11.28f)
            curveTo(24.987f, 11.573f, 24.513f, 11.573f, 24.22f, 11.28f)
            lineTo(21.72f, 8.78f)
            curveTo(21.427f, 8.487f, 21.427f, 8.013f, 21.72f, 7.72f)
            lineTo(24.22f, 5.22f)
            curveTo(24.513f, 4.927f, 24.987f, 4.927f, 25.28f, 5.22f)
            close()
            moveTo(6.5f, 5f)
            horizontalLineTo(15.206f)
            curveTo(15.069f, 5.324f, 14.95f, 5.658f, 14.852f, 6f)
            horizontalLineTo(6.5f)
            curveTo(4.567f, 6f, 3f, 7.567f, 3f, 9.5f)
            verticalLineTo(10.206f)
            lineTo(16f, 17.428f)
            lineTo(18.545f, 16.014f)
            curveTo(18.869f, 16.229f, 19.208f, 16.423f, 19.56f, 16.594f)
            lineTo(16.243f, 18.437f)
            curveTo(16.092f, 18.521f, 15.908f, 18.521f, 15.757f, 18.437f)
            lineTo(3f, 11.35f)
            verticalLineTo(22.5f)
            curveTo(3f, 24.433f, 4.567f, 26f, 6.5f, 26f)
            horizontalLineTo(25.5f)
            curveTo(27.433f, 26f, 29f, 24.433f, 29f, 22.5f)
            verticalLineTo(15.624f)
            curveTo(29.355f, 15.35f, 29.69f, 15.049f, 30f, 14.725f)
            verticalLineTo(22.5f)
            curveTo(30f, 24.985f, 27.985f, 27f, 25.5f, 27f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 27f, 2f, 24.985f, 2f, 22.5f)
            verticalLineTo(10.509f)
            curveTo(2f, 10.503f, 2f, 10.496f, 2f, 10.49f)
            verticalLineTo(9.5f)
            curveTo(2f, 7.015f, 4.015f, 5f, 6.5f, 5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailArrowDoubleBackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.MailArrowDoubleBack, contentDescription = null)
    }
}
