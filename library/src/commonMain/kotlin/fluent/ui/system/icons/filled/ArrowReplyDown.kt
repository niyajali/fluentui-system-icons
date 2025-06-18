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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.ArrowReplyDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowReplyDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.704f, 8.706f)
            curveTo(10.094f, 8.315f, 10.094f, 7.682f, 9.703f, 7.291f)
            curveTo(9.312f, 6.901f, 8.679f, 6.901f, 8.289f, 7.292f)
            lineTo(3.292f, 12.296f)
            curveTo(2.902f, 12.686f, 2.903f, 13.319f, 3.293f, 13.709f)
            lineTo(8.289f, 18.707f)
            curveTo(8.68f, 19.098f, 9.313f, 19.098f, 9.704f, 18.707f)
            curveTo(10.094f, 18.317f, 10.094f, 17.684f, 9.704f, 17.293f)
            lineTo(6.411f, 14f)
            horizontalLineTo(13f)
            curveTo(17.335f, 14f, 20.865f, 10.552f, 20.996f, 6.249f)
            lineTo(21f, 6f)
            curveTo(21f, 5.448f, 20.552f, 5f, 20f, 5f)
            curveTo(19.448f, 5f, 19f, 5.448f, 19f, 6f)
            curveTo(19f, 9.238f, 16.434f, 11.878f, 13.225f, 11.996f)
            lineTo(13f, 12f)
            horizontalLineTo(6.414f)
            lineTo(9.704f, 8.706f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowReplyDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowReplyDown, contentDescription = null)
    }
}
