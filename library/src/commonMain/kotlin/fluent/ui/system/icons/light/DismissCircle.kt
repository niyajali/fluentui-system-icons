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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Light.DismissCircle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.DismissCircle",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.146f, 10.146f)
            curveTo(9.951f, 10.342f, 9.951f, 10.658f, 10.146f, 10.854f)
            lineTo(15.293f, 16f)
            lineTo(10.146f, 21.146f)
            curveTo(9.951f, 21.342f, 9.951f, 21.658f, 10.146f, 21.854f)
            curveTo(10.342f, 22.049f, 10.658f, 22.049f, 10.854f, 21.854f)
            lineTo(16f, 16.707f)
            lineTo(21.146f, 21.854f)
            curveTo(21.342f, 22.049f, 21.658f, 22.049f, 21.854f, 21.854f)
            curveTo(22.049f, 21.658f, 22.049f, 21.342f, 21.854f, 21.146f)
            lineTo(16.707f, 16f)
            lineTo(21.854f, 10.854f)
            curveTo(22.049f, 10.658f, 22.049f, 10.342f, 21.854f, 10.146f)
            curveTo(21.658f, 9.951f, 21.342f, 9.951f, 21.146f, 10.146f)
            lineTo(16f, 15.293f)
            lineTo(10.854f, 10.146f)
            curveTo(10.658f, 9.951f, 10.342f, 9.951f, 10.146f, 10.146f)
            close()
            moveTo(2f, 16f)
            curveTo(2f, 8.268f, 8.268f, 2f, 16f, 2f)
            curveTo(23.732f, 2f, 30f, 8.268f, 30f, 16f)
            curveTo(30f, 23.732f, 23.732f, 30f, 16f, 30f)
            curveTo(8.268f, 30f, 2f, 23.732f, 2f, 16f)
            close()
            moveTo(16f, 3f)
            curveTo(8.82f, 3f, 3f, 8.82f, 3f, 16f)
            curveTo(3f, 23.18f, 8.82f, 29f, 16f, 29f)
            curveTo(23.18f, 29f, 29f, 23.18f, 29f, 16f)
            curveTo(29f, 8.82f, 23.18f, 3f, 16f, 3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DismissCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.DismissCircle, contentDescription = null)
    }
}
