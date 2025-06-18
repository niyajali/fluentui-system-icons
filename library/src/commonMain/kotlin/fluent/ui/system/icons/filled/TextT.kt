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

public val FluentIcons.Filled.TextT: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextT",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.75f, 5f)
            curveTo(4.75f, 4.448f, 5.198f, 4f, 5.75f, 4f)
            horizontalLineTo(18.25f)
            curveTo(18.802f, 4f, 19.25f, 4.448f, 19.25f, 5f)
            verticalLineTo(7f)
            curveTo(19.25f, 7.552f, 18.802f, 8f, 18.25f, 8f)
            curveTo(17.698f, 8f, 17.25f, 7.552f, 17.25f, 7f)
            verticalLineTo(6f)
            horizontalLineTo(13f)
            lineTo(13f, 18f)
            horizontalLineTo(14f)
            curveTo(14.552f, 18f, 15f, 18.448f, 15f, 19f)
            curveTo(15f, 19.552f, 14.552f, 20f, 14f, 20f)
            horizontalLineTo(10f)
            curveTo(9.448f, 20f, 9f, 19.552f, 9f, 19f)
            curveTo(9f, 18.448f, 9.448f, 18f, 10f, 18f)
            horizontalLineTo(11f)
            lineTo(11f, 6f)
            horizontalLineTo(6.75f)
            verticalLineTo(7f)
            curveTo(6.75f, 7.552f, 6.302f, 8f, 5.75f, 8f)
            curveTo(5.198f, 8f, 4.75f, 7.552f, 4.75f, 7f)
            verticalLineTo(5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextTPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextT, contentDescription = null)
    }
}
