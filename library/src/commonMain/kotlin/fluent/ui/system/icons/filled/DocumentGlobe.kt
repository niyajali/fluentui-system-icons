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

public val FluentIcons.Filled.DocumentGlobe: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentGlobe",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 8f)
            verticalLineTo(2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineTo(11.498f)
            curveTo(4.77f, 11.177f, 5.614f, 11f, 6.5f, 11f)
            curveTo(10.09f, 11f, 13f, 13.91f, 13f, 17.5f)
            curveTo(13f, 19.247f, 12.311f, 20.832f, 11.19f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(10f)
            horizontalLineTo(14f)
            curveTo(12.895f, 10f, 12f, 9.105f, 12f, 8f)
            close()
            moveTo(13.5f, 8f)
            verticalLineTo(2.5f)
            lineTo(19.5f, 8.5f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
            close()
            moveTo(5.007f, 17f)
            curveTo(5.047f, 15.585f, 5.255f, 14.331f, 5.56f, 13.415f)
            curveTo(5.731f, 12.902f, 5.924f, 12.522f, 6.114f, 12.281f)
            curveTo(6.309f, 12.034f, 6.443f, 12f, 6.5f, 12f)
            curveTo(6.557f, 12f, 6.691f, 12.034f, 6.886f, 12.281f)
            curveTo(7.076f, 12.522f, 7.269f, 12.902f, 7.44f, 13.415f)
            curveTo(7.745f, 14.331f, 7.953f, 15.585f, 7.993f, 17f)
            horizontalLineTo(5.007f)
            close()
            moveTo(4.611f, 13.099f)
            curveTo(4.719f, 12.777f, 4.841f, 12.478f, 4.979f, 12.213f)
            curveTo(2.836f, 12.828f, 1.229f, 14.712f, 1.022f, 17f)
            horizontalLineTo(4.007f)
            curveTo(4.047f, 15.5f, 4.266f, 14.134f, 4.611f, 13.099f)
            close()
            moveTo(8.389f, 13.099f)
            curveTo(8.281f, 12.777f, 8.159f, 12.478f, 8.021f, 12.213f)
            curveTo(10.164f, 12.828f, 11.771f, 14.712f, 11.978f, 17f)
            horizontalLineTo(8.993f)
            curveTo(8.953f, 15.5f, 8.734f, 14.134f, 8.389f, 13.099f)
            close()
            moveTo(8.993f, 18f)
            horizontalLineTo(11.978f)
            curveTo(11.771f, 20.288f, 10.164f, 22.172f, 8.021f, 22.787f)
            curveTo(8.159f, 22.522f, 8.281f, 22.223f, 8.389f, 21.901f)
            curveTo(8.734f, 20.865f, 8.953f, 19.5f, 8.993f, 18f)
            close()
            moveTo(6.886f, 22.719f)
            curveTo(6.691f, 22.966f, 6.557f, 23f, 6.5f, 23f)
            curveTo(6.443f, 23f, 6.309f, 22.966f, 6.114f, 22.719f)
            curveTo(5.924f, 22.478f, 5.731f, 22.098f, 5.56f, 21.584f)
            curveTo(5.255f, 20.669f, 5.047f, 19.414f, 5.007f, 18f)
            horizontalLineTo(7.993f)
            curveTo(7.953f, 19.414f, 7.745f, 20.669f, 7.44f, 21.584f)
            curveTo(7.269f, 22.098f, 7.076f, 22.478f, 6.886f, 22.719f)
            close()
            moveTo(1.022f, 18f)
            curveTo(1.229f, 20.288f, 2.836f, 22.172f, 4.979f, 22.787f)
            curveTo(4.841f, 22.522f, 4.719f, 22.223f, 4.611f, 21.901f)
            curveTo(4.266f, 20.865f, 4.047f, 19.5f, 4.007f, 18f)
            horizontalLineTo(1.022f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentGlobePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentGlobe, contentDescription = null)
    }
}
