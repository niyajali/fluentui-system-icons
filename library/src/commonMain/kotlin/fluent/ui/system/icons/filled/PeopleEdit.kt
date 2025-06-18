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

public val FluentIcons.Filled.PeopleEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 8f)
            curveTo(12f, 10.209f, 10.209f, 12f, 8f, 12f)
            curveTo(5.791f, 12f, 4f, 10.209f, 4f, 8f)
            curveTo(4f, 5.791f, 5.791f, 4f, 8f, 4f)
            curveTo(10.209f, 4f, 12f, 5.791f, 12f, 8f)
            close()
            moveTo(20f, 9f)
            curveTo(20f, 10.657f, 18.657f, 12f, 17f, 12f)
            curveTo(15.343f, 12f, 14f, 10.657f, 14f, 9f)
            curveTo(14f, 7.343f, 15.343f, 6f, 17f, 6f)
            curveTo(18.657f, 6f, 20f, 7.343f, 20f, 9f)
            close()
            moveTo(2f, 16.25f)
            curveTo(2f, 15.007f, 3.007f, 14f, 4.25f, 14f)
            horizontalLineTo(11.75f)
            curveTo(12.993f, 14f, 14f, 15.007f, 14f, 16.25f)
            verticalLineTo(16.356f)
            lineTo(12.491f, 17.865f)
            curveTo(12.019f, 18.337f, 11.684f, 18.929f, 11.522f, 19.577f)
            lineTo(11.325f, 20.366f)
            curveTo(10.498f, 20.749f, 9.416f, 21f, 8f, 21f)
            curveTo(2f, 21f, 2f, 16.5f, 2f, 16.5f)
            verticalLineTo(16.25f)
            close()
            moveTo(19.1f, 12.67f)
            lineTo(13.197f, 18.572f)
            curveTo(12.853f, 18.916f, 12.609f, 19.347f, 12.491f, 19.819f)
            lineTo(12.033f, 21.65f)
            curveTo(11.834f, 22.446f, 12.556f, 23.167f, 13.352f, 22.968f)
            lineTo(15.182f, 22.511f)
            curveTo(15.655f, 22.393f, 16.086f, 22.149f, 16.43f, 21.804f)
            lineTo(22.332f, 15.902f)
            curveTo(23.225f, 15.009f, 23.225f, 13.562f, 22.332f, 12.67f)
            curveTo(21.44f, 11.777f, 19.993f, 11.777f, 19.1f, 12.67f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PeopleEdit, contentDescription = null)
    }
}
