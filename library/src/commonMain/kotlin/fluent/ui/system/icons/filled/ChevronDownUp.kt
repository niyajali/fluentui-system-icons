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

public val FluentUi.Filled.ChevronDownUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronDownUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.707f, 2.793f)
            curveTo(6.317f, 2.402f, 5.683f, 2.402f, 5.293f, 2.793f)
            curveTo(4.902f, 3.183f, 4.902f, 3.817f, 5.293f, 4.207f)
            lineTo(11.293f, 10.207f)
            curveTo(11.683f, 10.598f, 12.317f, 10.598f, 12.707f, 10.207f)
            lineTo(18.707f, 4.207f)
            curveTo(19.098f, 3.817f, 19.098f, 3.183f, 18.707f, 2.793f)
            curveTo(18.317f, 2.402f, 17.683f, 2.402f, 17.293f, 2.793f)
            lineTo(12f, 8.086f)
            lineTo(6.707f, 2.793f)
            close()
            moveTo(6.707f, 21.207f)
            curveTo(6.317f, 21.598f, 5.683f, 21.598f, 5.293f, 21.207f)
            curveTo(4.902f, 20.817f, 4.902f, 20.183f, 5.293f, 19.793f)
            lineTo(11.293f, 13.793f)
            curveTo(11.683f, 13.402f, 12.317f, 13.402f, 12.707f, 13.793f)
            lineTo(18.707f, 19.793f)
            curveTo(19.098f, 20.183f, 19.098f, 20.817f, 18.707f, 21.207f)
            curveTo(18.317f, 21.598f, 17.683f, 21.598f, 17.293f, 21.207f)
            lineTo(12f, 15.914f)
            lineTo(6.707f, 21.207f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChevronDownUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ChevronDownUp, contentDescription = null)
    }
}
