/**
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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.Poll: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Poll",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.752f, 2f)
            curveTo(13.272f, 2f, 14.504f, 3.232f, 14.504f, 4.752f)
            verticalLineTo(19.25f)
            curveTo(14.504f, 20.77f, 13.272f, 22.002f, 11.752f, 22.002f)
            curveTo(10.232f, 22.002f, 9f, 20.77f, 9f, 19.25f)
            verticalLineTo(4.752f)
            curveTo(9f, 3.232f, 10.232f, 2f, 11.752f, 2f)
            close()
            moveTo(18.752f, 7f)
            curveTo(20.272f, 7f, 21.504f, 8.232f, 21.504f, 9.752f)
            verticalLineTo(19.25f)
            curveTo(21.504f, 20.77f, 20.272f, 22.002f, 18.752f, 22.002f)
            curveTo(17.232f, 22.002f, 16f, 20.77f, 16f, 19.25f)
            verticalLineTo(9.752f)
            curveTo(16f, 8.232f, 17.232f, 7f, 18.752f, 7f)
            close()
            moveTo(4.752f, 12f)
            curveTo(6.272f, 12f, 7.504f, 13.232f, 7.504f, 14.752f)
            verticalLineTo(19.25f)
            curveTo(7.504f, 20.77f, 6.272f, 22.002f, 4.752f, 22.002f)
            curveTo(3.232f, 22.002f, 2f, 20.77f, 2f, 19.25f)
            verticalLineTo(14.752f)
            curveTo(2f, 13.232f, 3.232f, 12f, 4.752f, 12f)
            close()
            moveTo(11.752f, 3.5f)
            curveTo(11.061f, 3.5f, 10.5f, 4.06f, 10.5f, 4.752f)
            verticalLineTo(19.25f)
            curveTo(10.5f, 19.942f, 11.061f, 20.502f, 11.752f, 20.502f)
            curveTo(12.443f, 20.502f, 13.004f, 19.942f, 13.004f, 19.25f)
            verticalLineTo(4.752f)
            curveTo(13.004f, 4.06f, 12.443f, 3.5f, 11.752f, 3.5f)
            close()
            moveTo(18.752f, 8.5f)
            curveTo(18.06f, 8.5f, 17.5f, 9.06f, 17.5f, 9.752f)
            verticalLineTo(19.25f)
            curveTo(17.5f, 19.942f, 18.06f, 20.502f, 18.752f, 20.502f)
            curveTo(19.443f, 20.502f, 20.004f, 19.942f, 20.004f, 19.25f)
            verticalLineTo(9.752f)
            curveTo(20.004f, 9.06f, 19.443f, 8.5f, 18.752f, 8.5f)
            close()
            moveTo(4.752f, 13.5f)
            curveTo(4.06f, 13.5f, 3.5f, 14.061f, 3.5f, 14.752f)
            verticalLineTo(19.25f)
            curveTo(3.5f, 19.942f, 4.06f, 20.502f, 4.752f, 20.502f)
            curveTo(5.443f, 20.502f, 6.004f, 19.942f, 6.004f, 19.25f)
            verticalLineTo(14.752f)
            curveTo(6.004f, 14.061f, 5.443f, 13.5f, 4.752f, 13.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PollPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Poll, contentDescription = null)
    }
}
