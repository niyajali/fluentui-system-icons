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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.DocumentBriefcase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentBriefcase",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.5f, 20f)
            curveTo(18.5f, 20.275f, 18.276f, 20.5f, 18f, 20.5f)
            horizontalLineTo(13f)
            verticalLineTo(21.5f)
            curveTo(13f, 21.671f, 12.983f, 21.838f, 12.95f, 22f)
            horizontalLineTo(18f)
            curveTo(19.104f, 22f, 20f, 21.104f, 20f, 20f)
            verticalLineTo(9.828f)
            curveTo(20f, 9.298f, 19.789f, 8.789f, 19.414f, 8.414f)
            lineTo(13.585f, 2.586f)
            curveTo(13.57f, 2.571f, 13.553f, 2.558f, 13.536f, 2.545f)
            curveTo(13.524f, 2.536f, 13.512f, 2.526f, 13.5f, 2.516f)
            curveTo(13.429f, 2.452f, 13.359f, 2.389f, 13.281f, 2.336f)
            curveTo(13.256f, 2.319f, 13.228f, 2.305f, 13.2f, 2.292f)
            curveTo(13.184f, 2.284f, 13.168f, 2.276f, 13.153f, 2.268f)
            curveTo(13.136f, 2.259f, 13.12f, 2.249f, 13.103f, 2.239f)
            curveTo(13.049f, 2.208f, 12.994f, 2.176f, 12.937f, 2.152f)
            curveTo(12.74f, 2.07f, 12.528f, 2.029f, 12.313f, 2.014f)
            curveTo(12.293f, 2.013f, 12.274f, 2.01f, 12.254f, 2.007f)
            curveTo(12.227f, 2.004f, 12.2f, 2f, 12.172f, 2f)
            horizontalLineTo(6f)
            curveTo(4.896f, 2f, 4f, 2.896f, 4f, 4f)
            verticalLineTo(11.104f)
            curveTo(4.238f, 11.036f, 4.49f, 11f, 4.75f, 11f)
            horizontalLineTo(5.5f)
            verticalLineTo(4f)
            curveTo(5.5f, 3.725f, 5.724f, 3.5f, 6f, 3.5f)
            horizontalLineTo(12f)
            verticalLineTo(8f)
            curveTo(12f, 9.104f, 12.896f, 10f, 14f, 10f)
            horizontalLineTo(18.5f)
            verticalLineTo(20f)
            close()
            moveTo(13.5f, 4.621f)
            lineTo(17.378f, 8.5f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.5f, 13.5f, 8.275f, 13.5f, 8f)
            verticalLineTo(4.621f)
            close()
            moveTo(3f, 15f)
            horizontalLineTo(2.5f)
            curveTo(1.672f, 15f, 1f, 15.672f, 1f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(1f, 22.328f, 1.672f, 23f, 2.5f, 23f)
            horizontalLineTo(10.5f)
            curveTo(11.328f, 23f, 12f, 22.328f, 12f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(12f, 15.672f, 11.328f, 15f, 10.5f, 15f)
            horizontalLineTo(10f)
            verticalLineTo(13.75f)
            curveTo(10f, 12.783f, 9.217f, 12f, 8.25f, 12f)
            horizontalLineTo(4.75f)
            curveTo(3.783f, 12f, 3f, 12.783f, 3f, 13.75f)
            verticalLineTo(15f)
            close()
            moveTo(4.5f, 13.75f)
            curveTo(4.5f, 13.612f, 4.612f, 13.5f, 4.75f, 13.5f)
            horizontalLineTo(8.25f)
            curveTo(8.388f, 13.5f, 8.5f, 13.612f, 8.5f, 13.75f)
            verticalLineTo(15f)
            horizontalLineTo(4.5f)
            verticalLineTo(13.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentBriefcasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentBriefcase, contentDescription = null)
    }
}
