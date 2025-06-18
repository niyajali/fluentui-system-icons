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

public val FluentIcons.Regular.Status: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Status",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.086f, 4.086f)
            curveTo(17.867f, 3.305f, 19.133f, 3.305f, 19.914f, 4.086f)
            curveTo(20.695f, 4.867f, 20.695f, 6.133f, 19.914f, 6.914f)
            lineTo(13.855f, 12.974f)
            curveTo(13.697f, 13.131f, 13.5f, 13.244f, 13.285f, 13.3f)
            lineTo(9.796f, 14.204f)
            lineTo(10.7f, 10.715f)
            curveTo(10.756f, 10.5f, 10.869f, 10.303f, 11.026f, 10.145f)
            lineTo(17.086f, 4.086f)
            close()
            moveTo(20.975f, 3.025f)
            curveTo(19.608f, 1.658f, 17.392f, 1.658f, 16.025f, 3.025f)
            lineTo(9.966f, 9.085f)
            curveTo(9.619f, 9.431f, 9.371f, 9.864f, 9.248f, 10.339f)
            lineTo(8.024f, 15.062f)
            curveTo(7.957f, 15.319f, 8.032f, 15.592f, 8.22f, 15.78f)
            curveTo(8.408f, 15.968f, 8.681f, 16.043f, 8.938f, 15.976f)
            lineTo(13.661f, 14.752f)
            curveTo(14.136f, 14.629f, 14.569f, 14.381f, 14.915f, 14.034f)
            lineTo(20.975f, 7.975f)
            curveTo(22.342f, 6.608f, 22.342f, 4.392f, 20.975f, 3.025f)
            close()
            moveTo(12f, 3f)
            curveTo(12.806f, 3f, 13.588f, 3.106f, 14.331f, 3.305f)
            lineTo(13.061f, 4.575f)
            curveTo(12.715f, 4.525f, 12.36f, 4.5f, 12f, 4.5f)
            curveTo(7.858f, 4.5f, 4.5f, 7.858f, 4.5f, 12f)
            curveTo(4.5f, 16.142f, 7.858f, 19.5f, 12f, 19.5f)
            curveTo(16.142f, 19.5f, 19.5f, 16.142f, 19.5f, 12f)
            curveTo(19.5f, 11.64f, 19.475f, 11.285f, 19.426f, 10.938f)
            lineTo(20.695f, 9.669f)
            curveTo(20.894f, 10.412f, 21f, 11.194f, 21f, 12f)
            curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
            curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
            curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StatusPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Status, contentDescription = null)
    }
}
