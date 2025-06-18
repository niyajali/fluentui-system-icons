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

public val FluentIcons.Regular.StoreMicrosoft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StoreMicrosoft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.5f, 9.5f)
            verticalLineTo(13f)
            horizontalLineTo(8f)
            verticalLineTo(9.5f)
            horizontalLineTo(11.5f)
            close()
            moveTo(11.5f, 17.5f)
            verticalLineTo(14f)
            horizontalLineTo(8f)
            verticalLineTo(17.5f)
            horizontalLineTo(11.5f)
            close()
            moveTo(16f, 9.5f)
            verticalLineTo(13f)
            horizontalLineTo(12.5f)
            verticalLineTo(9.5f)
            horizontalLineTo(16f)
            close()
            moveTo(16f, 17.5f)
            verticalLineTo(14f)
            horizontalLineTo(12.5f)
            verticalLineTo(17.5f)
            horizontalLineTo(16f)
            close()
            moveTo(8f, 6f)
            verticalLineTo(3.75f)
            curveTo(8f, 2.783f, 8.783f, 2f, 9.75f, 2f)
            horizontalLineTo(14.25f)
            curveTo(15.217f, 2f, 16f, 2.783f, 16f, 3.75f)
            verticalLineTo(6f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 6f, 22f, 6.336f, 22f, 6.75f)
            verticalLineTo(18.25f)
            curveTo(22f, 19.769f, 20.769f, 21f, 19.25f, 21f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 21f, 2f, 19.769f, 2f, 18.25f)
            verticalLineTo(6.75f)
            curveTo(2f, 6.336f, 2.336f, 6f, 2.75f, 6f)
            horizontalLineTo(8f)
            close()
            moveTo(9.5f, 3.75f)
            verticalLineTo(6f)
            horizontalLineTo(14.5f)
            verticalLineTo(3.75f)
            curveTo(14.5f, 3.612f, 14.388f, 3.5f, 14.25f, 3.5f)
            horizontalLineTo(9.75f)
            curveTo(9.612f, 3.5f, 9.5f, 3.612f, 9.5f, 3.75f)
            close()
            moveTo(3.5f, 18.25f)
            curveTo(3.5f, 18.94f, 4.06f, 19.5f, 4.75f, 19.5f)
            horizontalLineTo(19.25f)
            curveTo(19.94f, 19.5f, 20.5f, 18.94f, 20.5f, 18.25f)
            verticalLineTo(7.5f)
            horizontalLineTo(3.5f)
            verticalLineTo(18.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StoreMicrosoftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.StoreMicrosoft, contentDescription = null)
    }
}
