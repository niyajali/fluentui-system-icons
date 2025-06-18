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

public val FluentUi.Regular.PersonBriefcase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonBriefcase",
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
            curveTo(12.195f, 14.213f, 11.531f, 14.765f, 11.21f, 15.5f)
            horizontalLineTo(4.252f)
            curveTo(3.839f, 15.5f, 3.504f, 15.836f, 3.504f, 16.249f)
            verticalLineTo(16.826f)
            curveTo(3.504f, 17.362f, 3.695f, 17.88f, 4.043f, 18.287f)
            curveTo(5.296f, 19.755f, 7.262f, 20.501f, 10f, 20.501f)
            curveTo(10.346f, 20.501f, 10.679f, 20.489f, 11f, 20.465f)
            verticalLineTo(21.5f)
            curveTo(11f, 21.659f, 11.016f, 21.813f, 11.044f, 21.964f)
            curveTo(10.706f, 21.987f, 10.358f, 22.001f, 10f, 22.001f)
            curveTo(6.854f, 22.001f, 4.468f, 21.096f, 2.901f, 19.262f)
            curveTo(2.322f, 18.583f, 2.004f, 17.719f, 2.004f, 16.826f)
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
            moveTo(10f, 3.505f)
            curveTo(8.067f, 3.505f, 6.5f, 5.072f, 6.5f, 7.005f)
            curveTo(6.5f, 8.938f, 8.067f, 10.505f, 10f, 10.505f)
            curveTo(11.933f, 10.505f, 13.5f, 8.938f, 13.5f, 7.005f)
            curveTo(13.5f, 5.072f, 11.933f, 3.505f, 10f, 3.505f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonBriefcasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PersonBriefcase, contentDescription = null)
    }
}
