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

public val FluentIcons.Filled.Guitar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Guitar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.492f, 3.431f)
            lineTo(19.677f, 2.246f)
            curveTo(20.067f, 1.855f, 20.7f, 1.855f, 21.091f, 2.246f)
            lineTo(21.798f, 2.953f)
            curveTo(22.188f, 3.344f, 22.188f, 3.977f, 21.798f, 4.367f)
            lineTo(20.613f, 5.552f)
            lineTo(18.492f, 3.431f)
            close()
            moveTo(17.431f, 4.491f)
            lineTo(13.611f, 8.312f)
            lineTo(13.451f, 8.153f)
            curveTo(12.124f, 6.825f, 9.887f, 7.189f, 9.047f, 8.867f)
            lineTo(8.631f, 9.7f)
            curveTo(8.508f, 9.946f, 8.236f, 10.078f, 7.967f, 10.025f)
            lineTo(7.895f, 10.01f)
            curveTo(6.117f, 9.655f, 4.293f, 10.351f, 3.205f, 11.802f)
            curveTo(1.406f, 14.201f, 1.644f, 17.559f, 3.765f, 19.68f)
            lineTo(4.364f, 20.278f)
            curveTo(6.485f, 22.399f, 9.842f, 22.638f, 12.242f, 20.838f)
            curveTo(13.692f, 19.75f, 14.389f, 17.927f, 14.034f, 16.149f)
            lineTo(14.019f, 16.076f)
            curveTo(13.965f, 15.807f, 14.098f, 15.536f, 14.344f, 15.413f)
            lineTo(15.176f, 14.997f)
            curveTo(16.855f, 14.157f, 17.218f, 11.92f, 15.891f, 10.592f)
            lineTo(15.732f, 10.433f)
            lineTo(19.552f, 6.613f)
            lineTo(17.431f, 4.491f)
            close()
            moveTo(9.439f, 14.56f)
            curveTo(8.854f, 13.974f, 8.854f, 13.025f, 9.439f, 12.439f)
            curveTo(10.025f, 11.853f, 10.975f, 11.853f, 11.561f, 12.439f)
            curveTo(12.146f, 13.025f, 12.146f, 13.974f, 11.561f, 14.56f)
            curveTo(10.975f, 15.146f, 10.025f, 15.146f, 9.439f, 14.56f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GuitarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Guitar, contentDescription = null)
    }
}
