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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.Stop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Stop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.25f, 4.5f)
            curveTo(19.388f, 4.5f, 19.5f, 4.612f, 19.5f, 4.75f)
            verticalLineTo(19.25f)
            curveTo(19.5f, 19.388f, 19.388f, 19.5f, 19.25f, 19.5f)
            horizontalLineTo(4.75f)
            curveTo(4.612f, 19.5f, 4.5f, 19.388f, 4.5f, 19.25f)
            verticalLineTo(4.75f)
            curveTo(4.5f, 4.612f, 4.612f, 4.5f, 4.75f, 4.5f)
            horizontalLineTo(19.25f)
            close()
            moveTo(4.75f, 3f)
            curveTo(3.783f, 3f, 3f, 3.783f, 3f, 4.75f)
            verticalLineTo(19.25f)
            curveTo(3f, 20.216f, 3.783f, 21f, 4.75f, 21f)
            horizontalLineTo(19.25f)
            curveTo(20.216f, 21f, 21f, 20.216f, 21f, 19.25f)
            verticalLineTo(4.75f)
            curveTo(21f, 3.783f, 20.216f, 3f, 19.25f, 3f)
            horizontalLineTo(4.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Stop, contentDescription = null)
    }
}
