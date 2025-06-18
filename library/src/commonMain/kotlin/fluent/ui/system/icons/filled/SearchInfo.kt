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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.SearchInfo: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SearchInfo",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.102f, 16.162f)
            curveTo(13.717f, 17.31f, 11.939f, 18f, 10f, 18f)
            curveTo(5.582f, 18f, 2f, 14.418f, 2f, 10f)
            curveTo(2f, 5.582f, 5.582f, 2f, 10f, 2f)
            curveTo(14.418f, 2f, 18f, 5.582f, 18f, 10f)
            curveTo(18f, 11.939f, 17.31f, 13.717f, 16.162f, 15.102f)
            lineTo(20.78f, 19.72f)
            curveTo(21.073f, 20.013f, 21.073f, 20.487f, 20.78f, 20.78f)
            curveTo(20.487f, 21.073f, 20.013f, 21.073f, 19.72f, 20.78f)
            lineTo(15.102f, 16.162f)
            close()
            moveTo(10f, 9f)
            curveTo(9.586f, 9f, 9.25f, 9.336f, 9.25f, 9.75f)
            verticalLineTo(13.25f)
            curveTo(9.25f, 13.664f, 9.586f, 14f, 10f, 14f)
            curveTo(10.414f, 14f, 10.75f, 13.664f, 10.75f, 13.25f)
            verticalLineTo(9.75f)
            curveTo(10.75f, 9.336f, 10.414f, 9f, 10f, 9f)
            close()
            moveTo(10f, 7.5f)
            curveTo(10.552f, 7.5f, 11f, 7.052f, 11f, 6.5f)
            curveTo(11f, 5.948f, 10.552f, 5.5f, 10f, 5.5f)
            curveTo(9.448f, 5.5f, 9f, 5.948f, 9f, 6.5f)
            curveTo(9f, 7.052f, 9.448f, 7.5f, 10f, 7.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SearchInfoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SearchInfo, contentDescription = null)
    }
}
