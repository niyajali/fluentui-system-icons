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

public val FluentIcons.Regular.ColorLineAccent: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ColorLineAccent",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.004f, 15.631f)
            curveTo(4.014f, 15.781f, 4.041f, 15.93f, 4.084f, 16.075f)
            curveTo(4.402f, 17.133f, 5.517f, 17.733f, 6.575f, 17.415f)
            lineTo(10.868f, 16.127f)
            curveTo(11.294f, 15.999f, 11.688f, 15.785f, 12.027f, 15.5f)
            horizontalLineTo(19.5f)
            curveTo(20.052f, 15.5f, 20.5f, 15.948f, 20.5f, 16.5f)
            verticalLineTo(19.5f)
            curveTo(20.5f, 20.052f, 20.052f, 20.5f, 19.5f, 20.5f)
            horizontalLineTo(4.5f)
            curveTo(3.948f, 20.5f, 3.5f, 20.052f, 3.5f, 19.5f)
            verticalLineTo(16.5f)
            curveTo(3.5f, 16.128f, 3.703f, 15.804f, 4.004f, 15.631f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ColorLineAccentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ColorLineAccent, contentDescription = null)
    }
}
