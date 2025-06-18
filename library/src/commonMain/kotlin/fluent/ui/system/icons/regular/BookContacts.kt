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

public val FluentUi.Regular.BookContacts: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookContacts",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.5f, 2f)
            curveTo(5.119f, 2f, 4f, 3.119f, 4f, 4.5f)
            verticalLineTo(19.5f)
            curveTo(4f, 20.881f, 5.119f, 22f, 6.5f, 22f)
            horizontalLineTo(19.25f)
            curveTo(19.664f, 22f, 20f, 21.664f, 20f, 21.25f)
            curveTo(20f, 20.836f, 19.664f, 20.5f, 19.25f, 20.5f)
            horizontalLineTo(6.5f)
            curveTo(5.948f, 20.5f, 5.5f, 20.052f, 5.5f, 19.5f)
            horizontalLineTo(19.25f)
            curveTo(19.664f, 19.5f, 20f, 19.164f, 20f, 18.75f)
            verticalLineTo(4.5f)
            curveTo(20f, 3.119f, 18.881f, 2f, 17.5f, 2f)
            horizontalLineTo(6.5f)
            close()
            moveTo(5.5f, 18f)
            verticalLineTo(4.5f)
            curveTo(5.5f, 3.948f, 5.948f, 3.5f, 6.5f, 3.5f)
            horizontalLineTo(17.5f)
            curveTo(18.052f, 3.5f, 18.5f, 3.948f, 18.5f, 4.5f)
            verticalLineTo(18f)
            horizontalLineTo(5.5f)
            close()
            moveTo(14f, 8f)
            curveTo(14f, 9.105f, 13.105f, 10f, 12f, 10f)
            curveTo(10.895f, 10f, 10f, 9.105f, 10f, 8f)
            curveTo(10f, 6.895f, 10.895f, 6f, 12f, 6f)
            curveTo(13.105f, 6f, 14f, 6.895f, 14f, 8f)
            close()
            moveTo(15.5f, 12.5f)
            curveTo(15.5f, 13.745f, 14.5f, 15f, 12f, 15f)
            curveTo(9.5f, 15f, 8.5f, 13.75f, 8.5f, 12.5f)
            curveTo(8.5f, 11.672f, 9.172f, 11f, 10f, 11f)
            horizontalLineTo(14f)
            curveTo(14.828f, 11f, 15.5f, 11.672f, 15.5f, 12.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookContactsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BookContacts, contentDescription = null)
    }
}
