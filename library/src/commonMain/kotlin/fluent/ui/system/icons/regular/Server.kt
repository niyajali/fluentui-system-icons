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

public val FluentUi.Regular.Server: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Server",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.25f, 6f)
            curveTo(8.836f, 6f, 8.5f, 6.336f, 8.5f, 6.75f)
            curveTo(8.5f, 7.164f, 8.836f, 7.5f, 9.25f, 7.5f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 7.5f, 15.5f, 7.164f, 15.5f, 6.75f)
            curveTo(15.5f, 6.336f, 15.164f, 6f, 14.75f, 6f)
            horizontalLineTo(9.25f)
            close()
            moveTo(8.5f, 17.75f)
            curveTo(8.5f, 17.336f, 8.836f, 17f, 9.25f, 17f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 17f, 15.5f, 17.336f, 15.5f, 17.75f)
            curveTo(15.5f, 18.164f, 15.164f, 18.5f, 14.75f, 18.5f)
            horizontalLineTo(9.25f)
            curveTo(8.836f, 18.5f, 8.5f, 18.164f, 8.5f, 17.75f)
            close()
            moveTo(9.25f, 14f)
            curveTo(8.836f, 14f, 8.5f, 14.336f, 8.5f, 14.75f)
            curveTo(8.5f, 15.164f, 8.836f, 15.5f, 9.25f, 15.5f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 15.5f, 15.5f, 15.164f, 15.5f, 14.75f)
            curveTo(15.5f, 14.336f, 15.164f, 14f, 14.75f, 14f)
            horizontalLineTo(9.25f)
            close()
            moveTo(6f, 5f)
            curveTo(6f, 3.343f, 7.343f, 2f, 9f, 2f)
            horizontalLineTo(15f)
            curveTo(16.657f, 2f, 18f, 3.343f, 18f, 5f)
            verticalLineTo(19f)
            curveTo(18f, 20.657f, 16.657f, 22f, 15f, 22f)
            horizontalLineTo(9f)
            curveTo(7.343f, 22f, 6f, 20.657f, 6f, 19f)
            verticalLineTo(5f)
            close()
            moveTo(9f, 3.5f)
            curveTo(8.172f, 3.5f, 7.5f, 4.172f, 7.5f, 5f)
            verticalLineTo(19f)
            curveTo(7.5f, 19.828f, 8.172f, 20.5f, 9f, 20.5f)
            horizontalLineTo(15f)
            curveTo(15.828f, 20.5f, 16.5f, 19.828f, 16.5f, 19f)
            verticalLineTo(5f)
            curveTo(16.5f, 4.172f, 15.828f, 3.5f, 15f, 3.5f)
            horizontalLineTo(9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ServerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Server, contentDescription = null)
    }
}
