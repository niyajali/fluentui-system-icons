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

public val FluentUi.Regular.Add: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Add",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 3.25f)
            curveTo(12.414f, 3.25f, 12.75f, 3.586f, 12.75f, 4f)
            verticalLineTo(11.25f)
            horizontalLineTo(20f)
            curveTo(20.414f, 11.25f, 20.75f, 11.586f, 20.75f, 12f)
            curveTo(20.75f, 12.414f, 20.414f, 12.75f, 20f, 12.75f)
            horizontalLineTo(12.75f)
            verticalLineTo(20f)
            curveTo(12.75f, 20.414f, 12.414f, 20.75f, 12f, 20.75f)
            curveTo(11.586f, 20.75f, 11.25f, 20.414f, 11.25f, 20f)
            verticalLineTo(12.75f)
            horizontalLineTo(4f)
            curveTo(3.586f, 12.75f, 3.25f, 12.414f, 3.25f, 12f)
            curveTo(3.25f, 11.586f, 3.586f, 11.25f, 4f, 11.25f)
            horizontalLineTo(11.25f)
            verticalLineTo(4f)
            curveTo(11.25f, 3.586f, 11.586f, 3.25f, 12f, 3.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Add, contentDescription = null)
    }
}
