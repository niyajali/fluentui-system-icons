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

public val FluentIcons.Regular.Smartwatch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Smartwatch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.5f, 6.401f)
            verticalLineTo(4f)
            curveTo(7.5f, 2.895f, 8.395f, 2f, 9.5f, 2f)
            horizontalLineTo(14.5f)
            curveTo(15.605f, 2f, 16.5f, 2.895f, 16.5f, 4f)
            verticalLineTo(6.401f)
            curveTo(17.397f, 6.92f, 18f, 7.89f, 18f, 9f)
            verticalLineTo(10f)
            curveTo(18.552f, 10f, 19f, 10.448f, 19f, 11f)
            verticalLineTo(12f)
            curveTo(19f, 12.552f, 18.552f, 13f, 18f, 13f)
            verticalLineTo(15f)
            curveTo(18f, 16.11f, 17.397f, 17.08f, 16.5f, 17.599f)
            lineTo(16.5f, 20f)
            curveTo(16.5f, 21.105f, 15.605f, 22f, 14.5f, 22f)
            horizontalLineTo(9.5f)
            curveTo(8.395f, 22f, 7.5f, 21.105f, 7.5f, 20f)
            lineTo(7.5f, 17.599f)
            curveTo(6.603f, 17.08f, 6f, 16.11f, 6f, 15f)
            verticalLineTo(9f)
            curveTo(6f, 7.89f, 6.603f, 6.92f, 7.5f, 6.401f)
            close()
            moveTo(9.5f, 3.5f)
            curveTo(9.224f, 3.5f, 9f, 3.724f, 9f, 4f)
            verticalLineTo(6f)
            horizontalLineTo(15f)
            verticalLineTo(4f)
            curveTo(15f, 3.724f, 14.776f, 3.5f, 14.5f, 3.5f)
            horizontalLineTo(9.5f)
            close()
            moveTo(16.5f, 15f)
            verticalLineTo(9f)
            curveTo(16.5f, 8.172f, 15.828f, 7.5f, 15f, 7.5f)
            horizontalLineTo(9f)
            curveTo(8.172f, 7.5f, 7.5f, 8.172f, 7.5f, 9f)
            verticalLineTo(15f)
            curveTo(7.5f, 15.828f, 8.172f, 16.5f, 9f, 16.5f)
            horizontalLineTo(15f)
            curveTo(15.828f, 16.5f, 16.5f, 15.828f, 16.5f, 15f)
            close()
            moveTo(9f, 20f)
            curveTo(9f, 20.276f, 9.224f, 20.5f, 9.5f, 20.5f)
            horizontalLineTo(14.5f)
            curveTo(14.776f, 20.5f, 15f, 20.276f, 15f, 20f)
            verticalLineTo(18f)
            horizontalLineTo(9f)
            lineTo(9f, 20f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SmartwatchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Smartwatch, contentDescription = null)
    }
}
