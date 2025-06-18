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

public val FluentUi.Filled.RowTriple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RowTriple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.75f, 2.02f)
            curveTo(4.784f, 2.02f, 4f, 2.803f, 4f, 3.77f)
            verticalLineTo(6.27f)
            curveTo(4f, 7.236f, 4.784f, 8.02f, 5.75f, 8.02f)
            horizontalLineTo(18.25f)
            curveTo(19.216f, 8.02f, 20f, 7.236f, 20f, 6.27f)
            verticalLineTo(3.77f)
            curveTo(20f, 2.803f, 19.216f, 2.02f, 18.25f, 2.02f)
            horizontalLineTo(5.75f)
            close()
            moveTo(5.75f, 9.02f)
            curveTo(4.784f, 9.02f, 4f, 9.803f, 4f, 10.769f)
            verticalLineTo(13.269f)
            curveTo(4f, 14.236f, 4.784f, 15.019f, 5.75f, 15.019f)
            horizontalLineTo(18.25f)
            curveTo(19.216f, 15.019f, 20f, 14.236f, 20f, 13.269f)
            verticalLineTo(10.769f)
            curveTo(20f, 9.803f, 19.216f, 9.02f, 18.25f, 9.02f)
            horizontalLineTo(5.75f)
            close()
            moveTo(5.75f, 16.02f)
            curveTo(4.784f, 16.02f, 4f, 16.803f, 4f, 17.77f)
            verticalLineTo(20.27f)
            curveTo(4f, 21.236f, 4.784f, 22.02f, 5.75f, 22.02f)
            horizontalLineTo(18.25f)
            curveTo(19.216f, 22.02f, 20f, 21.236f, 20f, 20.27f)
            verticalLineTo(17.77f)
            curveTo(20f, 16.803f, 19.216f, 16.02f, 18.25f, 16.02f)
            horizontalLineTo(5.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RowTriplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.RowTriple, contentDescription = null)
    }
}
