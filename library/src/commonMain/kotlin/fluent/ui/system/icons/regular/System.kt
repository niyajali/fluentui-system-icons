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

public val FluentUi.Regular.System: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.System",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.75f, 5f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 5f, 22f, 6.231f, 22f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(22f, 17.769f, 20.769f, 19f, 19.25f, 19f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 19f, 2f, 17.769f, 2f, 16.25f)
            verticalLineTo(7.75f)
            curveTo(2f, 6.231f, 3.231f, 5f, 4.75f, 5f)
            close()
            moveTo(4.75f, 6.5f)
            curveTo(4.06f, 6.5f, 3.5f, 7.06f, 3.5f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(3.5f, 16.94f, 4.06f, 17.5f, 4.75f, 17.5f)
            horizontalLineTo(19.25f)
            curveTo(19.94f, 17.5f, 20.5f, 16.94f, 20.5f, 16.25f)
            verticalLineTo(7.75f)
            curveTo(20.5f, 7.06f, 19.94f, 6.5f, 19.25f, 6.5f)
            horizontalLineTo(4.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SystemPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.System, contentDescription = null)
    }
}
