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

public val FluentIcons.Filled.MusicNote1: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MusicNote1",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.513f, 2.048f)
            curveTo(11.283f, 1.961f, 11.025f, 1.993f, 10.823f, 2.134f)
            curveTo(10.621f, 2.274f, 10.5f, 2.504f, 10.5f, 2.75f)
            verticalLineTo(14.877f)
            curveTo(9.815f, 14.328f, 8.946f, 14f, 8f, 14f)
            curveTo(5.791f, 14f, 4f, 15.791f, 4f, 18f)
            curveTo(4f, 20.209f, 5.791f, 22f, 8f, 22f)
            curveTo(10.061f, 22f, 11.758f, 20.441f, 11.976f, 18.438f)
            curveTo(11.992f, 18.378f, 12f, 18.315f, 12f, 18.25f)
            verticalLineTo(8.832f)
            lineTo(18.987f, 11.452f)
            curveTo(19.217f, 11.539f, 19.475f, 11.507f, 19.677f, 11.366f)
            curveTo(19.879f, 11.226f, 20f, 10.996f, 20f, 10.75f)
            verticalLineTo(7.483f)
            curveTo(20f, 6.128f, 19.16f, 4.915f, 17.891f, 4.439f)
            lineTo(11.513f, 2.048f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MusicNote1Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MusicNote1, contentDescription = null)
    }
}
