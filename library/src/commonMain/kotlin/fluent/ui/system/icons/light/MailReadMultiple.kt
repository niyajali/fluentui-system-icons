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

public val FluentUi.Light.MailReadMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.MailReadMultiple",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.253f, 4.065f)
            curveTo(14.406f, 3.978f, 14.594f, 3.978f, 14.747f, 4.065f)
            lineTo(23.861f, 9.244f)
            curveTo(24.27f, 9.476f, 24.588f, 9.826f, 24.783f, 10.237f)
            lineTo(14.75f, 16.039f)
            curveTo(14.595f, 16.128f, 14.405f, 16.128f, 14.25f, 16.039f)
            lineTo(4.217f, 10.237f)
            curveTo(4.411f, 9.826f, 4.73f, 9.476f, 5.138f, 9.244f)
            lineTo(14.253f, 4.065f)
            close()
            moveTo(4f, 11.267f)
            lineTo(13.749f, 16.904f)
            curveTo(14.214f, 17.173f, 14.786f, 17.173f, 15.251f, 16.904f)
            lineTo(25f, 11.267f)
            verticalLineTo(19.5f)
            curveTo(25f, 21.433f, 23.433f, 23f, 21.5f, 23f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 23f, 4f, 21.433f, 4f, 19.5f)
            verticalLineTo(11.267f)
            close()
            moveTo(15.241f, 3.196f)
            curveTo(14.781f, 2.935f, 14.219f, 2.935f, 13.759f, 3.196f)
            lineTo(4.644f, 8.375f)
            curveTo(3.628f, 8.952f, 3f, 10.031f, 3f, 11.2f)
            verticalLineTo(19.5f)
            curveTo(3f, 21.985f, 5.015f, 24f, 7.5f, 24f)
            horizontalLineTo(21.5f)
            curveTo(23.985f, 24f, 26f, 21.985f, 26f, 19.5f)
            verticalLineTo(11.2f)
            curveTo(26f, 10.031f, 25.372f, 8.952f, 24.355f, 8.375f)
            lineTo(15.241f, 3.196f)
            close()
            moveTo(7.671f, 26f)
            curveTo(8.444f, 26.625f, 9.428f, 27f, 10.5f, 27f)
            horizontalLineTo(22.5f)
            curveTo(26.09f, 27f, 29f, 24.09f, 29f, 20.5f)
            verticalLineTo(14.35f)
            curveTo(29f, 13.454f, 28.631f, 12.61f, 28f, 12.005f)
            verticalLineTo(19.5f)
            lineTo(28f, 19.521f)
            verticalLineTo(20.5f)
            curveTo(28f, 23.538f, 25.538f, 26f, 22.5f, 26f)
            horizontalLineTo(10.5f)
            lineTo(10.489f, 26f)
            horizontalLineTo(7.671f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailReadMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.MailReadMultiple, contentDescription = null)
    }
}
