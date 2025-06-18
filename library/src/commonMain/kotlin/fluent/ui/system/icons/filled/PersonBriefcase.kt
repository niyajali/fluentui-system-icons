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

public val FluentUi.Filled.PersonBriefcase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonBriefcase",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.25f, 12f)
            curveTo(20.216f, 12f, 21f, 12.783f, 21f, 13.75f)
            verticalLineTo(15f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 15f, 23f, 15.672f, 23f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(23f, 22.328f, 22.328f, 23f, 21.5f, 23f)
            horizontalLineTo(13.5f)
            curveTo(12.672f, 23f, 12f, 22.328f, 12f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(12f, 15.672f, 12.672f, 15f, 13.5f, 15f)
            horizontalLineTo(14f)
            verticalLineTo(13.75f)
            curveTo(14f, 12.783f, 14.783f, 12f, 15.75f, 12f)
            horizontalLineTo(19.25f)
            close()
            moveTo(15.75f, 13.5f)
            curveTo(15.612f, 13.5f, 15.5f, 13.612f, 15.5f, 13.75f)
            verticalLineTo(15f)
            horizontalLineTo(19.5f)
            verticalLineTo(13.75f)
            curveTo(19.5f, 13.612f, 19.388f, 13.5f, 19.25f, 13.5f)
            horizontalLineTo(15.75f)
            close()
            moveTo(13f, 14.05f)
            curveTo(11.859f, 14.281f, 11f, 15.29f, 11f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(11f, 21.658f, 11.016f, 21.813f, 11.044f, 21.963f)
            curveTo(10.706f, 21.986f, 10.358f, 22.001f, 10f, 22.001f)
            curveTo(6.579f, 22.001f, 4.056f, 20.929f, 2.514f, 18.765f)
            curveTo(2.182f, 18.299f, 2.004f, 17.741f, 2.004f, 17.169f)
            verticalLineTo(16.249f)
            curveTo(2.004f, 15.007f, 3.01f, 14f, 4.252f, 14f)
            horizontalLineTo(13f)
            verticalLineTo(14.05f)
            close()
            moveTo(10f, 2.005f)
            curveTo(12.761f, 2.005f, 15f, 4.243f, 15f, 7.005f)
            curveTo(15f, 9.766f, 12.761f, 12.005f, 10f, 12.005f)
            curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
            curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonBriefcasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PersonBriefcase, contentDescription = null)
    }
}
