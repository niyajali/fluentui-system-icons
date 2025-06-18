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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.ArrowHookDownRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookDownRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.5f, 6f)
            horizontalLineTo(16f)
            curveTo(16.552f, 6f, 17f, 5.552f, 17f, 5f)
            curveTo(17f, 4.448f, 16.552f, 4f, 16f, 4f)
            horizontalLineTo(10.5f)
            curveTo(6.91f, 4f, 4f, 6.91f, 4f, 10.5f)
            curveTo(4f, 14.09f, 6.91f, 17f, 10.5f, 17f)
            horizontalLineTo(15.64f)
            lineTo(13.707f, 18.933f)
            curveTo(13.317f, 19.323f, 13.317f, 19.957f, 13.707f, 20.347f)
            curveTo(14.098f, 20.738f, 14.731f, 20.738f, 15.121f, 20.347f)
            lineTo(18.65f, 16.818f)
            curveTo(18.742f, 16.727f, 18.812f, 16.622f, 18.861f, 16.51f)
            curveTo(18.949f, 16.36f, 19f, 16.186f, 19f, 16f)
            curveTo(19f, 15.71f, 18.877f, 15.449f, 18.68f, 15.267f)
            curveTo(18.671f, 15.257f, 18.662f, 15.248f, 18.653f, 15.238f)
            lineTo(15.122f, 11.707f)
            curveTo(14.731f, 11.317f, 14.098f, 11.317f, 13.707f, 11.707f)
            curveTo(13.317f, 12.098f, 13.317f, 12.731f, 13.707f, 13.121f)
            lineTo(15.586f, 15f)
            horizontalLineTo(10.5f)
            curveTo(8.015f, 15f, 6f, 12.985f, 6f, 10.5f)
            curveTo(6f, 8.015f, 8.015f, 6f, 10.5f, 6f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowHookDownRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowHookDownRight, contentDescription = null)
    }
}
