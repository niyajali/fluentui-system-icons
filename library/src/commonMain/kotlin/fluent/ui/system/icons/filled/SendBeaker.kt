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

public val FluentIcons.Filled.SendBeaker: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SendBeaker",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.815f, 11.95f)
            lineTo(5.283f, 13.205f)
            curveTo(5.107f, 13.234f, 4.96f, 13.356f, 4.897f, 13.523f)
            lineTo(2.299f, 20.481f)
            curveTo(2.051f, 21.12f, 2.72f, 21.73f, 3.334f, 21.423f)
            lineTo(15.298f, 15.441f)
            curveTo(14.55f, 15.242f, 14f, 14.56f, 14f, 13.75f)
            curveTo(14f, 12.783f, 14.783f, 12f, 15.75f, 12f)
            horizontalLineTo(21.25f)
            curveTo(21.4f, 12f, 21.546f, 12.019f, 21.686f, 12.055f)
            curveTo(21.835f, 11.712f, 21.717f, 11.274f, 21.334f, 11.082f)
            lineTo(3.334f, 2.082f)
            curveTo(2.72f, 1.775f, 2.051f, 2.385f, 2.299f, 3.024f)
            lineTo(4.897f, 9.982f)
            curveTo(4.96f, 10.149f, 5.107f, 10.271f, 5.283f, 10.3f)
            lineTo(12.815f, 11.555f)
            curveTo(12.924f, 11.573f, 12.997f, 11.677f, 12.979f, 11.785f)
            curveTo(12.965f, 11.87f, 12.899f, 11.936f, 12.815f, 11.95f)
            close()
            moveTo(15.75f, 14.5f)
            horizontalLineTo(16.5f)
            verticalLineTo(17.195f)
            curveTo(16.5f, 17.543f, 16.409f, 17.884f, 16.237f, 18.186f)
            lineTo(15.773f, 19f)
            horizontalLineTo(21.226f)
            lineTo(20.763f, 18.189f)
            curveTo(20.591f, 17.887f, 20.5f, 17.545f, 20.5f, 17.197f)
            verticalLineTo(14.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 14.5f, 22f, 14.164f, 22f, 13.75f)
            curveTo(22f, 13.336f, 21.664f, 13f, 21.25f, 13f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 13f, 15f, 13.336f, 15f, 13.75f)
            curveTo(15f, 14.164f, 15.336f, 14.5f, 15.75f, 14.5f)
            close()
            moveTo(15.202f, 20f)
            lineTo(14.199f, 21.757f)
            curveTo(13.629f, 22.757f, 14.351f, 24f, 15.502f, 24f)
            horizontalLineTo(21.497f)
            curveTo(22.648f, 24f, 23.37f, 22.757f, 22.799f, 21.757f)
            lineTo(21.797f, 20f)
            horizontalLineTo(15.202f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SendBeakerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SendBeaker, contentDescription = null)
    }
}
