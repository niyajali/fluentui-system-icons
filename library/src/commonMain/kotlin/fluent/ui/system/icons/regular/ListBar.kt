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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.ListBar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ListBar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 5.75f)
            curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
            horizontalLineTo(18.25f)
            curveTo(19.769f, 3f, 21f, 4.231f, 21f, 5.75f)
            verticalLineTo(7.25f)
            curveTo(21f, 8.038f, 20.669f, 8.749f, 20.138f, 9.25f)
            curveTo(20.669f, 9.751f, 21f, 10.462f, 21f, 11.25f)
            verticalLineTo(12.75f)
            curveTo(21f, 13.538f, 20.669f, 14.249f, 20.138f, 14.75f)
            curveTo(20.669f, 15.251f, 21f, 15.962f, 21f, 16.75f)
            verticalLineTo(18.25f)
            curveTo(21f, 19.769f, 19.769f, 21f, 18.25f, 21f)
            horizontalLineTo(5.75f)
            curveTo(4.231f, 21f, 3f, 19.769f, 3f, 18.25f)
            verticalLineTo(16.75f)
            curveTo(3f, 15.962f, 3.331f, 15.251f, 3.863f, 14.75f)
            curveTo(3.331f, 14.249f, 3f, 13.538f, 3f, 12.75f)
            verticalLineTo(11.25f)
            curveTo(3f, 10.462f, 3.331f, 9.751f, 3.863f, 9.25f)
            curveTo(3.331f, 8.749f, 3f, 8.038f, 3f, 7.25f)
            verticalLineTo(5.75f)
            close()
            moveTo(19.5f, 7.25f)
            verticalLineTo(5.75f)
            curveTo(19.5f, 5.06f, 18.94f, 4.5f, 18.25f, 4.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(8.5f)
            horizontalLineTo(18.25f)
            curveTo(18.94f, 8.5f, 19.5f, 7.94f, 19.5f, 7.25f)
            close()
            moveTo(8f, 4.5f)
            horizontalLineTo(5.75f)
            curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
            verticalLineTo(7.25f)
            curveTo(4.5f, 7.94f, 5.06f, 8.5f, 5.75f, 8.5f)
            horizontalLineTo(8f)
            verticalLineTo(4.5f)
            close()
            moveTo(8f, 10f)
            horizontalLineTo(5.75f)
            curveTo(5.06f, 10f, 4.5f, 10.56f, 4.5f, 11.25f)
            verticalLineTo(12.75f)
            curveTo(4.5f, 13.44f, 5.06f, 14f, 5.75f, 14f)
            horizontalLineTo(8f)
            verticalLineTo(10f)
            close()
            moveTo(8f, 15.5f)
            horizontalLineTo(5.75f)
            curveTo(5.06f, 15.5f, 4.5f, 16.06f, 4.5f, 16.75f)
            verticalLineTo(18.25f)
            curveTo(4.5f, 18.94f, 5.06f, 19.5f, 5.75f, 19.5f)
            horizontalLineTo(8f)
            verticalLineTo(15.5f)
            close()
            moveTo(9.5f, 19.5f)
            horizontalLineTo(18.25f)
            curveTo(18.94f, 19.5f, 19.5f, 18.94f, 19.5f, 18.25f)
            verticalLineTo(16.75f)
            curveTo(19.5f, 16.06f, 18.94f, 15.5f, 18.25f, 15.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(19.5f)
            close()
            moveTo(9.5f, 14f)
            horizontalLineTo(18.25f)
            curveTo(18.94f, 14f, 19.5f, 13.44f, 19.5f, 12.75f)
            verticalLineTo(11.25f)
            curveTo(19.5f, 10.56f, 18.94f, 10f, 18.25f, 10f)
            horizontalLineTo(9.5f)
            verticalLineTo(14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ListBarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ListBar, contentDescription = null)
    }
}
