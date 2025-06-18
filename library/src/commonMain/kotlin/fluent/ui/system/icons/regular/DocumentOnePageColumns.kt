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

public val FluentIcons.Regular.DocumentOnePageColumns: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentOnePageColumns",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 2f, 20f, 3.007f, 20f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(20f, 20.993f, 18.993f, 22f, 17.75f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            close()
            moveTo(6.25f, 3.5f)
            curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 20.5f, 18.5f, 20.164f, 18.5f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(18.5f, 3.836f, 18.164f, 3.5f, 17.75f, 3.5f)
            horizontalLineTo(6.25f)
            close()
            moveTo(9.25f, 5f)
            curveTo(9.664f, 5f, 10f, 5.336f, 10f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(10f, 18.664f, 9.664f, 19f, 9.25f, 19f)
            curveTo(8.836f, 19f, 8.5f, 18.664f, 8.5f, 18.25f)
            verticalLineTo(5.75f)
            curveTo(8.5f, 5.336f, 8.836f, 5f, 9.25f, 5f)
            close()
            moveTo(15.5f, 5.75f)
            curveTo(15.5f, 5.336f, 15.164f, 5f, 14.75f, 5f)
            curveTo(14.336f, 5f, 14f, 5.336f, 14f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(14f, 18.664f, 14.336f, 19f, 14.75f, 19f)
            curveTo(15.164f, 19f, 15.5f, 18.664f, 15.5f, 18.25f)
            verticalLineTo(5.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentOnePageColumnsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentOnePageColumns, contentDescription = null)
    }
}
