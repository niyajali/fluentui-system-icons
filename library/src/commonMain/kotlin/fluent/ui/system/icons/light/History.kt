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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Light.History: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.History",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 7.693f)
            verticalLineTo(3.5f)
            curveTo(6f, 3.224f, 5.776f, 3f, 5.5f, 3f)
            curveTo(5.224f, 3f, 5f, 3.224f, 5f, 3.5f)
            verticalLineTo(9.5f)
            curveTo(5f, 9.776f, 5.224f, 10f, 5.5f, 10f)
            horizontalLineTo(11.5f)
            curveTo(11.776f, 10f, 12f, 9.776f, 12f, 9.5f)
            curveTo(12f, 9.224f, 11.776f, 9f, 11.5f, 9f)
            horizontalLineTo(6.252f)
            curveTo(8.43f, 5.972f, 11.985f, 4f, 16f, 4f)
            curveTo(22.627f, 4f, 28f, 9.373f, 28f, 16f)
            curveTo(28f, 22.627f, 22.627f, 28f, 16f, 28f)
            curveTo(9.373f, 28f, 4f, 22.627f, 4f, 16f)
            curveTo(4f, 15.52f, 4.028f, 15.046f, 4.083f, 14.581f)
            curveTo(4.119f, 14.276f, 3.886f, 14f, 3.579f, 14f)
            curveTo(3.334f, 14f, 3.124f, 14.179f, 3.095f, 14.422f)
            curveTo(3.032f, 14.939f, 3f, 15.466f, 3f, 16f)
            curveTo(3f, 23.18f, 8.82f, 29f, 16f, 29f)
            curveTo(23.18f, 29f, 29f, 23.18f, 29f, 16f)
            curveTo(29f, 8.82f, 23.18f, 3f, 16f, 3f)
            curveTo(11.979f, 3f, 8.385f, 4.825f, 6f, 7.693f)
            close()
            moveTo(15.5f, 8f)
            curveTo(15.776f, 8f, 16f, 8.224f, 16f, 8.5f)
            verticalLineTo(16f)
            horizontalLineTo(21.5f)
            curveTo(21.776f, 16f, 22f, 16.224f, 22f, 16.5f)
            curveTo(22f, 16.776f, 21.776f, 17f, 21.5f, 17f)
            horizontalLineTo(15.5f)
            curveTo(15.224f, 17f, 15f, 16.776f, 15f, 16.5f)
            verticalLineTo(8.5f)
            curveTo(15f, 8.224f, 15.224f, 8f, 15.5f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HistoryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.History, contentDescription = null)
    }
}
