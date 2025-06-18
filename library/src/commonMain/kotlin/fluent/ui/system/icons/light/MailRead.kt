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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Light.MailRead: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.MailRead",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.975f, 2.538f)
            curveTo(16.737f, 1.825f, 15.214f, 1.827f, 13.978f, 2.541f)
            lineTo(3.999f, 8.307f)
            curveTo(2.762f, 9.021f, 2f, 10.341f, 2f, 11.77f)
            verticalLineTo(22.5f)
            curveTo(2f, 24.985f, 4.015f, 27f, 6.5f, 27f)
            horizontalLineTo(25.5f)
            curveTo(27.985f, 27f, 30f, 24.985f, 30f, 22.5f)
            verticalLineTo(11.774f)
            curveTo(30f, 10.343f, 29.236f, 9.021f, 27.996f, 8.307f)
            lineTo(17.975f, 2.538f)
            close()
            moveTo(14.478f, 3.407f)
            curveTo(15.405f, 2.871f, 16.548f, 2.87f, 17.476f, 3.404f)
            lineTo(27.497f, 9.174f)
            curveTo(28.003f, 9.465f, 28.404f, 9.892f, 28.664f, 10.394f)
            lineTo(16f, 17.428f)
            lineTo(3.336f, 10.391f)
            curveTo(3.595f, 9.89f, 3.994f, 9.464f, 4.499f, 9.172f)
            lineTo(14.478f, 3.407f)
            close()
            moveTo(3.028f, 11.364f)
            lineTo(15.757f, 18.437f)
            curveTo(15.908f, 18.521f, 16.092f, 18.521f, 16.243f, 18.437f)
            lineTo(28.972f, 11.367f)
            curveTo(28.991f, 11.5f, 29f, 11.636f, 29f, 11.774f)
            verticalLineTo(22.5f)
            curveTo(29f, 24.433f, 27.433f, 26f, 25.5f, 26f)
            horizontalLineTo(6.5f)
            curveTo(4.567f, 26f, 3f, 24.433f, 3f, 22.5f)
            verticalLineTo(11.77f)
            curveTo(3f, 11.633f, 3.009f, 11.497f, 3.028f, 11.364f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailReadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.MailRead, contentDescription = null)
    }
}
