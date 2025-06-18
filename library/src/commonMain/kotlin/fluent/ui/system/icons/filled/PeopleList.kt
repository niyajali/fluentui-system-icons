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

public val FluentUi.Filled.PeopleList: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleList",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 12f)
            curveTo(10.209f, 12f, 12f, 10.209f, 12f, 8f)
            curveTo(12f, 5.791f, 10.209f, 4f, 8f, 4f)
            curveTo(5.791f, 4f, 4f, 5.791f, 4f, 8f)
            curveTo(4f, 10.209f, 5.791f, 12f, 8f, 12f)
            close()
            moveTo(17f, 12f)
            curveTo(18.657f, 12f, 20f, 10.657f, 20f, 9f)
            curveTo(20f, 7.343f, 18.657f, 6f, 17f, 6f)
            curveTo(15.343f, 6f, 14f, 7.343f, 14f, 9f)
            curveTo(14f, 10.657f, 15.343f, 12f, 17f, 12f)
            close()
            moveTo(4.25f, 14f)
            curveTo(3.007f, 14f, 2f, 15.007f, 2f, 16.25f)
            verticalLineTo(16.5f)
            curveTo(2f, 16.5f, 2f, 21f, 8f, 21f)
            curveTo(9.855f, 21f, 11.136f, 20.57f, 12.021f, 19.976f)
            curveTo(12.081f, 19.596f, 12.263f, 19.257f, 12.525f, 19f)
            curveTo(12.201f, 18.682f, 12f, 18.24f, 12f, 17.75f)
            curveTo(12f, 17.26f, 12.201f, 16.818f, 12.525f, 16.5f)
            curveTo(12.201f, 16.182f, 12f, 15.74f, 12f, 15.25f)
            curveTo(12f, 14.812f, 12.161f, 14.411f, 12.428f, 14.104f)
            curveTo(12.214f, 14.036f, 11.986f, 14f, 11.75f, 14f)
            horizontalLineTo(4.25f)
            close()
            moveTo(13.75f, 14.5f)
            curveTo(13.336f, 14.5f, 13f, 14.836f, 13f, 15.25f)
            curveTo(13f, 15.664f, 13.336f, 16f, 13.75f, 16f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 16f, 22f, 15.664f, 22f, 15.25f)
            curveTo(22f, 14.836f, 21.664f, 14.5f, 21.25f, 14.5f)
            horizontalLineTo(13.75f)
            close()
            moveTo(13.75f, 17f)
            curveTo(13.336f, 17f, 13f, 17.336f, 13f, 17.75f)
            curveTo(13f, 18.164f, 13.336f, 18.5f, 13.75f, 18.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 18.5f, 22f, 18.164f, 22f, 17.75f)
            curveTo(22f, 17.336f, 21.664f, 17f, 21.25f, 17f)
            horizontalLineTo(13.75f)
            close()
            moveTo(13.75f, 19.5f)
            curveTo(13.336f, 19.5f, 13f, 19.836f, 13f, 20.25f)
            curveTo(13f, 20.664f, 13.336f, 21f, 13.75f, 21f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 21f, 22f, 20.664f, 22f, 20.25f)
            curveTo(22f, 19.836f, 21.664f, 19.5f, 21.25f, 19.5f)
            horizontalLineTo(13.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PeopleList, contentDescription = null)
    }
}
