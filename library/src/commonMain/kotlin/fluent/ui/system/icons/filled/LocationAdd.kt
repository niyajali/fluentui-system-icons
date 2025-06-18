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

public val FluentUi.Filled.LocationAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.97f, 18.056f)
            lineTo(18.157f, 16.882f)
            curveTo(21.558f, 13.481f, 21.558f, 7.968f, 18.157f, 4.568f)
            curveTo(14.757f, 1.167f, 9.244f, 1.167f, 5.843f, 4.568f)
            curveTo(2.443f, 7.968f, 2.443f, 13.481f, 5.843f, 16.882f)
            curveTo(6.139f, 17.178f, 6.506f, 17.541f, 6.945f, 17.972f)
            lineTo(10.436f, 21.368f)
            curveTo(11.308f, 22.211f, 12.692f, 22.211f, 13.564f, 21.368f)
            curveTo(14.96f, 20.018f, 16.095f, 18.914f, 16.97f, 18.056f)
            close()
            moveTo(12f, 7f)
            curveTo(12.414f, 7f, 12.75f, 7.335f, 12.75f, 7.75f)
            verticalLineTo(10f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 10f, 16f, 10.335f, 16f, 10.75f)
            curveTo(16f, 11.164f, 15.664f, 11.5f, 15.25f, 11.5f)
            horizontalLineTo(12.75f)
            verticalLineTo(13.75f)
            curveTo(12.75f, 14.164f, 12.414f, 14.5f, 12f, 14.5f)
            curveTo(11.586f, 14.5f, 11.25f, 14.164f, 11.25f, 13.75f)
            verticalLineTo(11.5f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 11.5f, 8f, 11.164f, 8f, 10.75f)
            curveTo(8f, 10.335f, 8.336f, 10f, 8.75f, 10f)
            horizontalLineTo(11.25f)
            verticalLineTo(7.75f)
            curveTo(11.25f, 7.335f, 11.586f, 7f, 12f, 7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LocationAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.LocationAdd, contentDescription = null)
    }
}
