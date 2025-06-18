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

public val FluentUi.Filled.TextColumnTwo: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextColumnTwo",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6f)
            curveTo(3f, 5.448f, 3.448f, 5f, 4f, 5f)
            horizontalLineTo(10f)
            curveTo(10.552f, 5f, 11f, 5.448f, 11f, 6f)
            curveTo(11f, 6.552f, 10.552f, 7f, 10f, 7f)
            horizontalLineTo(4f)
            curveTo(3.448f, 7f, 3f, 6.552f, 3f, 6f)
            close()
            moveTo(3f, 10f)
            curveTo(3f, 9.448f, 3.448f, 9f, 4f, 9f)
            horizontalLineTo(10f)
            curveTo(10.552f, 9f, 11f, 9.448f, 11f, 10f)
            curveTo(11f, 10.552f, 10.552f, 11f, 10f, 11f)
            horizontalLineTo(4f)
            curveTo(3.448f, 11f, 3f, 10.552f, 3f, 10f)
            close()
            moveTo(3f, 14f)
            curveTo(3f, 13.448f, 3.448f, 13f, 4f, 13f)
            horizontalLineTo(10f)
            curveTo(10.552f, 13f, 11f, 13.448f, 11f, 14f)
            curveTo(11f, 14.552f, 10.552f, 15f, 10f, 15f)
            horizontalLineTo(4f)
            curveTo(3.448f, 15f, 3f, 14.552f, 3f, 14f)
            close()
            moveTo(3f, 18f)
            curveTo(3f, 17.448f, 3.448f, 17f, 4f, 17f)
            horizontalLineTo(10f)
            curveTo(10.552f, 17f, 11f, 17.448f, 11f, 18f)
            curveTo(11f, 18.552f, 10.552f, 19f, 10f, 19f)
            horizontalLineTo(4f)
            curveTo(3.448f, 19f, 3f, 18.552f, 3f, 18f)
            close()
            moveTo(13f, 6f)
            curveTo(13f, 5.448f, 13.448f, 5f, 14f, 5f)
            horizontalLineTo(20f)
            curveTo(20.552f, 5f, 21f, 5.448f, 21f, 6f)
            curveTo(21f, 6.552f, 20.552f, 7f, 20f, 7f)
            horizontalLineTo(14f)
            curveTo(13.448f, 7f, 13f, 6.552f, 13f, 6f)
            close()
            moveTo(13f, 10f)
            curveTo(13f, 9.448f, 13.448f, 9f, 14f, 9f)
            horizontalLineTo(20f)
            curveTo(20.552f, 9f, 21f, 9.448f, 21f, 10f)
            curveTo(21f, 10.552f, 20.552f, 11f, 20f, 11f)
            horizontalLineTo(14f)
            curveTo(13.448f, 11f, 13f, 10.552f, 13f, 10f)
            close()
            moveTo(13f, 14f)
            curveTo(13f, 13.448f, 13.448f, 13f, 14f, 13f)
            horizontalLineTo(20f)
            curveTo(20.552f, 13f, 21f, 13.448f, 21f, 14f)
            curveTo(21f, 14.552f, 20.552f, 15f, 20f, 15f)
            horizontalLineTo(14f)
            curveTo(13.448f, 15f, 13f, 14.552f, 13f, 14f)
            close()
            moveTo(13f, 18f)
            curveTo(13f, 17.448f, 13.448f, 17f, 14f, 17f)
            horizontalLineTo(20f)
            curveTo(20.552f, 17f, 21f, 17.448f, 21f, 18f)
            curveTo(21f, 18.552f, 20.552f, 19f, 20f, 19f)
            horizontalLineTo(14f)
            curveTo(13.448f, 19f, 13f, 18.552f, 13f, 18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextColumnTwoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextColumnTwo, contentDescription = null)
    }
}
